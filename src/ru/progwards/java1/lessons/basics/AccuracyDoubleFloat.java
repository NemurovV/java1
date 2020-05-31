package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println("V земли в типе double: " + volumeBallDouble(6371.2) + " кубических километров");
        System.out.println("V земли в типе float: " + volumeBallFloat(6371.2f) + " кубических километров");
        System.out.println("разница V земли между типами double и float: " + calculateAccuracy(6371.2) + " кубических километров");
    }
    //Формула объёма шара 4/3πR3

    //3.1 Реализовать функцию
    //public static double volumeBallDouble(double radius), которая будет возвращать
    // объём шара с радиусом radius и основана на типе double.
    public static double volumeBallDouble(double radius) {
        double pi = 3.14;
        return 4 / (3 * (pi * radius * radius * radius));
    }

    //3.2 Реализовать функцию
    //public static float volumeBallFloat(float radius), которая будет возвращать
    // объём шара с радиусом radius и основана на типе float.
    public static float volumeBallFloat(float radius) {
        float pi = 3.14f;
        return 4 / (3 *( pi * radius * radius * radius));
    }

    //3.3 Реализовать функцию
    //public static double calculateAccuracy(double radius), которая будет
    // возвращать разницу между функциями volumeBallDouble и volumeBallFloat
    // (они должны быть вызваны из неё с параметром radius).
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble((float)6371.2) - volumeBallFloat(6371.2f);
    }
}
