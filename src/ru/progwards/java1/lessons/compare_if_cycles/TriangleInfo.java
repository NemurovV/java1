package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
        System.out.println(isTriangle(3, 4, 2));
        System.out.println(isRightTriangle(5, 4, 3));
        System.out.println(isIsoscelesTriangle(5, 3, 2));
    }

    //    2.1 Реализовать функцию
//    public static boolean isTriangle(int a, int b, int c), которая возвращает true,
//    если по данным трём сторонам (a, b, c) можно построить треугольник. Из геометрии известно,
//    что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
    public static boolean isTriangle(int a, int b, int c) {
        boolean result;
        return a + b > c && a + c > b && b + c > a;
    }

    //    2.2 Реализовать функцию
//    public static boolean isRightTriangle(int a, int b, int c), которая возвращает true,
//    если треугольник со сторонами a, b, c является прямоугольным. Из геометрии известно,
//    что для прямоугольного треугольника выполняется теорема Пифагора
//    (сумма квадратов катетов равна квадрату гипотенузы).
    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result;
        return c * c == a * a + b * b || a * a == b * b + c * c || b * b == a * a + c * c;
    }

    //    2.3 Реализовать функцию
//    public static boolean isIsoscelesTriangle(int a, int b, int c), которая возвращает true,
//    если треугольник со сторонами a, b, c является равнобедренным. Из геометрии известно,
//    что в равнобедренном треугольнике есть две равные стороны.
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result;
        return a == b || a == c || b == c;
    }
}
