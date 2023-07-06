package practice;

import java.util.Scanner;

//Задание 1.
public class HomeTask {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
    double m = scanner.nextDouble();
        System.out.println("Введите еще одно любое число");
        double n = scanner.nextDouble();

    int a = 10;
        double b = (a - m);
    if (b<0) b = (-b);
        double c = (a - n);
        if (c<0) c = (-c);
        if(b==c)
    {
        System.out.println("Числа " + n + " и " + m + " одинаково близки к 10 ");
    }
        if(b>c)

    {
        System.out.println("Число " + n + " ближе к 10");
    }
        if(b<c)

    {
        System.out.println("Число " + m + " ближе к 10");

    }
}
}
