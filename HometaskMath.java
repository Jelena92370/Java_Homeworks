package de.telran.lessons4;


public class HometaskMath {

        static int add(int a, int b) {
            int addition = a + b;
            return addition;
        }

        static int sub(int a, int b) {
            int substruction = a - b;
            return substruction;
        }

        static int mult(int a, int b) {
            int multiplication = a * b;
            return multiplication;
        }
        static int div(int a, int b) {
            int division = a / b;
            return division;
        }
    public static void main(String[] args) {
        int int1 = 88;
        int int2 = 11;
add(int1, int2);
sub(int1, int2);
mult(int1, int2);
div(int1, int2);
        System.out.println("Сумма = "+add(int1, int2));
        System.out.println("Разность = "+sub(int1, int2));
        System.out.println("Произведение = "+mult(int1, int2));
        System.out.println("Соотношение, целое число = "+div(int1, int2));
    }
}
