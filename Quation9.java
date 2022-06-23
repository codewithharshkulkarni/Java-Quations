package Exersise_Quations;

import java.util.Scanner;

public class Quation9 {

    public static int GCD(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1 = n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        int n1 = sc.nextInt();

        System.out.println("Enter the Second Number :");
        int n2 = sc.nextInt();

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is :" + n1);
    }
}