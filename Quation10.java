package Exersise_Quations;

import java.util.Scanner;

public class Quation10 {
    public static void fibonacciSeries(int n) {
        int n1 = 0, n2 = 1;
        int n3;
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number n");
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}
