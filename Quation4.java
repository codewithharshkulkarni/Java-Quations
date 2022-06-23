package Exersise_Quations;

import java.util.Scanner;

public class Quation4 {
    public static double circumference(int r) {
        double pi = 3.14;

        double c = 2 * pi * r;

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Radious Of the Circule :");
        int r = sc.nextInt();
        double c = circumference(r);
        System.out.println("Circumference Of the Circule is " + c);
    }

}