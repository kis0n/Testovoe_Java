package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество проверок ");
        int chislo = in.nextInt();
        float[] znach = new float[chislo];

        for(int i = 0;i<chislo; i++) {
            System.out.print("Введите число ");
            znach[i] = in.nextInt();

        }

        for(int i = 0;i<chislo; i++){
            float del = znach[i] / 3;
            String result = String.format("%.4f", del);
            int contains = result.indexOf(",0000");

            if (contains != -1 ) {
                int normrez = (int) znach[i];
                System.out.println(normrez + " делится на 3 без остатка");

            }
        }
        in.close();

    }
}

