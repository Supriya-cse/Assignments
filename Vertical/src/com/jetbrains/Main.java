package com.jetbrains;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("*");
        }

    }
}