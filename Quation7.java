package Exersise_Quations;

import java.util.Scanner;

public class Quation7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0, n = 0, z = 0;
        System.out.println("Enter the Length Number Of Arrye:");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enetr the Elements in the Arrye :");

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0) {
                z++;
            } else if (number[i] > 0) {
                p++;
            } else if (number[i] < 0) {
                n++;
            }
        }

        System.out.println("Positive Numbers : " + p);
        System.out.println("Negative Numbers : " + n);
        System.out.println("Zero's : " + z);
    }
}