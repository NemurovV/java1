package ru.progwards.java1.lessons.basics;


public class ReverseDigits {

    public static void main(String[] args) {
        System.out.println(reverseDigits(800));
    }

    public static int reverseDigits(int number) {

        for (int i = 0; i < number; i++) {
            i = number % 10;
                number /= 10;
//                System.out.print(i);
                number = number + i;
        }
        return number;
    }
}
