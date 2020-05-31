package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
//    Проведём простое исследование типов double и float на разницу в точности. Посчитаем объём земли
//    в кубических километрах двумя сходными функциями. Одна из них будет основана на типе double,
//    а вторая на менее точном типе float. После чего мы сможем узнать разницу между этими значениями
//    в кубических километрах. Радиус земли R будем считать равным 6371.2 км (для проверки работы методов
//    используйте это значение), а число π возьмём равным 3.14


    public static void main(String[] args) {
        System.out.println("V земли в типе double: " + volumeBallDouble(6371.2) + " кубических километров");
        System.out.println("V земли в типе float: " + volumeBallFloat(6371.2f) + " кубических километров");
        System.out.println("разница V земли между типами double и float: " + calculateAccuracy(6371.2) + " " +
                "кубических километров");
    }
//Формула объёма шара 4/3πR3. Для решения задачи следует.

    //3.1 Реализовать функцию
    //public static double volumeBallDouble(double radius), которая будет возвращать
    // объём шара с радиусом radius и основана на типе double.
    public static double volumeBallDouble(double radius) {
        double pi = 3.14;
        return 4 / (3 * pi * radius * radius * radius);
    }

    //3.2 Реализовать функцию
    //public static float volumeBallFloat(float radius), которая будет возвращать
    // объём шара с радиусом radius и основана на типе float.
    public static float volumeBallFloat(float radius) {
        float pi = 3.14f;
        return 4 / (3 * pi * radius * radius * radius);
    }

    //3.3 Реализовать функцию
    //public static double calculateAccuracy(double radius), которая будет
    // возвращать разницу между функциями volumeBallDouble и volumeBallFloat
    // (они должны быть вызваны из неё с параметром radius).
    public static double calculateAccuracy(double radius) {
        return  volumeBallFloat(6371.2f) - volumeBallDouble((float)6371.2);
    }
}
