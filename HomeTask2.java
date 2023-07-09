package test.example;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        int maxNumber = compare(number1, number2, number3);

        System.out.println("Наибольшее из трех число = : " + maxNumber);
    }

    private static int compare(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }


    }
