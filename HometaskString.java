package de.telran.lessons4;

import java.lang.reflect.Method;

public class HometaskString {
    public static void main(String[] args) {

String myStr;
        myStr = new String("I study Basic Java!");
        newM(myStr);
        }
    static void newM(String myStr) {
         String newStr = myStr;
        System.out.println("Моя строка - "+newStr);
        System.out.println("Предпоследний символ - "+newStr.charAt(17));
        System.out.println("Слово Java - в наличии? "+newStr.contains("Java"));
        System.out.println("Без Java - "+newStr.replace("Java", ""));
        System.out.println("А меняется на о - "+newStr.replace('a', 'o'));
        System.out.println("Заглавные буквы - "+newStr.toUpperCase());
        System.out.println("Строчные буквы - "+newStr.toLowerCase());







    }
}
