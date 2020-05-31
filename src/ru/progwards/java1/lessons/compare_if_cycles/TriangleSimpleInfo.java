package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(10, 8, 10));
        System.out.println(minSide(3, 4, 3));
        System.out.println(isEquilateralTriangle(2, 2, 1));
    }

    /*1.1 Реализовать функцию
    public static int maxSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна наибольшую длину стороны.
    */
    public static int maxSide(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    /*
    1.2 Реализовать функцию
    public static int minSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна наименьшую длину стороны.
    */
    public static int minSide(int a, int b, int c) {
        int min = 0;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        return min;

    }

    /*
    1.3 Реализовать функцию
    public static boolean isEquilateralTriangle(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна true, если треугольник равносторонний и false в противном случае.
    */
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean bool;
        return a == b && a == c;
    }

}

