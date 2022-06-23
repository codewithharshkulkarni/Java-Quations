package Exersise_Quations;

import java.util.*;

public class Quation5 {
    public static void voterAge(int age) {
        if (age <= 18) {
            System.out.println("Sorry!");
            System.out.println("You are Not Eligible For Vote");
        } else {
            System.out.println("congratulations!");
            System.out.println("You are Eligible For Vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        voterAge(age);
    }

}