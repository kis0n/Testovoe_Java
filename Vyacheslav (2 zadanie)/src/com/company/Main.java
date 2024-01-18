
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        String vyach = "Вячеслав";

        if (name.equals(vyach)) {
            System.out.println("Привет, Вячеслав");

        }

        else {
            System.out.println("Нет такого имени");


        }

//        System.out.printf(num);
        in.close();

    }
}

