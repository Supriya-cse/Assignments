package com.jetbrains;
import java.util.Scanner;
public class Main {
    public static void generate(int n){
        if(n==1)
            System.out.println();
        else {
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i + ",");
                    n = n / i;
                }
                if (n < 1)
                    System.out.println(n);
            }
            System.out.println("\b");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int n=sc.nextInt();
        generate(n);
    }
}
