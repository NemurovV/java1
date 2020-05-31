package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final static double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("S поверхности Земли равна: " + earthSquare() + " км.");
        System.out.println("S поверхности Меркурия равна: " +  mercurySquare() +" км");
        System.out.println("S поверхности Юпитера равна: " +  jupiterSquare() +" км");
        System.out.println("S поверхности Земли больше S поверхности Меркурия на " + earthVsMercury() + " км.");
        System.out.println("S поверхности Земли меньше S поверхности Юпитера на " + earthVsJupiter() + " км.");
    }

    //public static Double sphereSquare(Double r),
    // которая вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r) {
        //S = 4πR2.
        return 4 * PI * r * r;
    }

    //public static Double earthSquare(), которая вычисляет
    // площадь поверхности Земли, считая радиус равным 6 371.2 км и используют функцию sphereSquare
    public static Double earthSquare() {
        return sphereSquare(6371.2);
    }

    //public static Double mercurySquare(), которая вычисляет
    // площадь поверхности Меркурия, считая радиус равным 2 439,7 км  и используют функцию sphereSquare
    public static Double mercurySquare() {
        return sphereSquare(2439.7);
    }

    //public static Double jupiterSquare(), которая вычисляет
    // площадь поверхности Юпитера, считая радиус равным 71 492 км  и используют функцию sphereSquare
    public static Double jupiterSquare() {
        return sphereSquare((double) 71492);
    }

    //public static Double earthVsMercury(), которая вычисляет
    //отношение площади поверхности Земли к площади поверхности
    // Меркурия используя готовые функции площадей планет
    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }

    //public static Double earthVsJupiter(), которая вычисляет
    //отношение площади поверхности Земли к площади поверхности Юпитера используя готовые функции площадей планет
    public static Double earthVsJupiter() {
        return earthSquare() /jupiterSquare();
    }
}
