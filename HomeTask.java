package test.example;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        int currentTime, start1, end1, start2, end2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Старт работы магазина Edeka = ");
        start1 = scanner.nextInt(24);
        System.out.print("Окончание работы магазина Edeka = ");
        end1 = scanner.nextInt(24);
        System.out.print("\nСтарт работы магазина Rewe = ");
        start2 = scanner.nextInt(24);
        System.out.print("Окончание работы магазина Rewe = ");
        end2 = scanner.nextInt(24);

        System.out.println("\nВведите текущее время");
        currentTime = scanner.nextInt(24);


    boolean isEdekaOpen = workingShop(start1, end1, currentTime);
    boolean isReweOpen = workingShop(start2, end2, currentTime);

    boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Можно ли купить еду? " + canBuy);
}

    static boolean workingShop(int start, int end, int currentTime) {
        return currentTime >= start && currentTime <= end;
    }

    static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;

    }
}
