package Exersise_Quations;

import java.util.Scanner;

public class Quation2 {
    public static int sumOfOddNUmbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N :");
        int n = sc.nextInt();
        int sum = sumOfOddNUmbers(n);
        System.out.println(sum);
    }
}
