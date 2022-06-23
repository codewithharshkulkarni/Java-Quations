package Exersise_Quations;

import java.util.Scanner;

public class Quation3 {
    public static void greterNumber(int a, int b) {

        if (a == b) {
            System.out.println("Both are Equal");
        } else if (a < b) {
            System.out.println(b + " is Greter than " + a);
        } else if (b > a) {
            System.out.println(a + " is Greter than " + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Numbers to Compare Which one is Greater :");
        int a = sc.nextInt(), b = sc.nextInt();
        greterNumber(a, b);
    }
}
