package test.example;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeap(year);

        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    private static boolean isLeap(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
                }
        else if (year % 400 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}


