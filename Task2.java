package practice;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
    int n = random.nextInt(28800), b=n/60/60;
        System.out.println("До конца рабочего дня осталось "+n + " секунд");
        switch(b){
        case 0:
            System.out.println("До конца рабочего дня осталось меньше часа");
            break;
        case 1:
            System.out.println("До конца рабочего дня остался "+b+" час");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println("До конца рабочего дня осталось "+b+" часа");
            break;
        default:
            System.out.println("До конца рабочего дня осталось "+b+ " часов");
    }
}


    }










