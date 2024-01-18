
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = in.nextLine();

        int contains = num.indexOf(".");
        if (contains > 0) {
//            System.out.println("soderjit tochku");
            float result = Float.parseFloat(num);
            if (result > 7) {
                System.out.println("Привет");
            }
            else {
                System.out.println("Пока");
            }
        }

        else {
//            System.out.println("ne soderjit");
            Integer result = Integer.valueOf(num);
            if (result > 7) {
                System.out.println("Привет");
            }
            else {
                System.out.println("Пока");
            }

        }

//        System.out.printf(num);
        in.close();

    }
}
