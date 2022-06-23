package Exersise_Quations;

import java.util.Scanner;

/**
 * es8
 */
public class Quation8 {

    public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = x * result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int x = sc.nextInt();
        System.out.println("ENter the Power to the Number :");
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println(x + " to the Power " + n + " is " + result);
    }
}