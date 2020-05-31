package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(10, 5,-1));
        System.out.println(minSide(-2, 4, 0));
        System.out.println(isEquilateralTriangle(2, 1, 2));
    }
/*1.1 Реализовать функцию
public static int maxSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
а вернуть должна наибольшую длину стороны.
*/
public static int maxSide(int a, int b, int c) {
    return a = Math.max(Math.max(a, b), c);
}

/*
1.2 Реализовать функцию
public static int minSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
а вернуть должна наименьшую длину стороны.
*/
public static int minSide(int a, int b, int c) {
    return a = Math.min(Math.min(a, b), c);
}
/*
1.3 Реализовать функцию
public static boolean isEquilateralTriangle(int a, int b, int c), которая получает параметрами длины сторон треугольника,
а вернуть должна true, если треугольник равносторонний и false в противном случае.
*/
public static boolean isEquilateralTriangle(int a, int b, int c) {
    boolean bool;
    return  a == b & a == c;
}

}

