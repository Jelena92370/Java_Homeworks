package telran.practice;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, сколько долларов у вас осталось на счету: ");
        int N = scanner.nextInt();
        int days = daysNeeded(N);
        System.out.println("Чтобы снять все деньги, вам понадобится: " + days +" дней");
    }

    public static int daysNeeded(int N) {
        int days = 0;
        while (N > 0) {
            int allowedSum = findMaxDivisor(N);
            N -= allowedSum;
            days++;
        }
        return days;
    }

    private static int findMaxDivisor(int N) {
        for (int i = N - 1; i >= 1; i--) {
            if (N % i == 0) {
                return i;
            }
        }
        return 1;
    }


}

