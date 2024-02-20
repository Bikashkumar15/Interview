package com.gfg.practice;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        System.out.println("Enter value of n :");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int pst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=pst;j++){
            System.out.print("*");
            }
            pst++;
            System.out.println();

        }
    }
}
