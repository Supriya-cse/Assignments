package com.jetbrains;

import java.util.Scanner;

public class Main {
    public static void iscoscelsTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int input = sc.nextInt();
        iscoscelsTriangle(input);
    }

   }