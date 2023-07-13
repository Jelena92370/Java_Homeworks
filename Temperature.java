package telran.practice;

import java.util.Random;

public class Temperature {
    public static void main(String[] args) {
        {
            Random random = new Random();

            int temperature1 = random.nextInt(199);
            System.out.println("Температура в первой колбе = " +temperature1);
            int temperature2 = random.nextInt(199);
            System.out.println("Температура во второй колбе = " +temperature2);

            boolean checkDeviсe = checkDeviсe(temperature1, temperature2);

            System.out.println("Правильно ли работает устройство: " +checkDeviсe);
        }


    }

    private static boolean checkDeviсe(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
               return true;
        }       else {
                return false;
        }

    }
}
