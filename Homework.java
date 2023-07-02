package Lesson7;

import java.util.Scanner;
public class Homework {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ввести слово с четным количеством букв: ");
            String word1 = scanner.next();
                        int half1 = 0;
                if (word1.length() % 2 == 0) {
                half1 = word1.length() / 2;}
                else {
                    System.out.println("Ошибка! Нечетное количество букв!");
                    System.out.print("Ввести слово с четным количеством букв: ");
                }

                System.out.print("Ввести еще одно слово с четным количеством букв: ");
                String word2 = scanner.next();
            if (word2.length() % 2 == 0) {
                int half2 = word2.length() / 2;
                String newWord = word1.substring(0, half1) + word2.substring(half2);
                System.out.println("Результат: " +newWord);}
            else {
                System.out.println("Ошибка! Нечетное количество букв!");
            }

            }
        }

