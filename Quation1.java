package Exersise_Quations;

import java.util.*;

public class Quation1 {
    public static int avrage(int a, int b, int c) {
        int ave = (a + b + c) / 3;
        return ave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number");
        int c = sc.nextInt();

        float avrage = avrage(a, b, c);

        System.out.println("Avrage of " + a + " " + b + " " + c + " is " + avrage);
    }
}
