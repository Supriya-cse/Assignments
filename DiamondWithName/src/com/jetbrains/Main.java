package com.jetbrains;

import java.util.Scanner;

public class Main {
    public static void diamond(int n) {
        for (int i = 1; i <= n-1; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.println();
        }
            System.out.println("Supriya");
        for (int j = 1; j <= n - 1; j++)
        {
            for (int i = 1; i <= j; i++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * (n - j) - 1; k++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int input = sc.nextInt();
        diamond(input);
    }
}
