package com.gfg.practice.starprogram;

import java.util.Scanner;

public class SimpleStar {
    public static void main(String[] args) {

        System.out.print("Enter value of n: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        simplePattern(n);
        System.out.println("print N*N pattern:");
        rowColumnSamePattern(n);
        System.out.println("print increase Order pattern");
        increaseOrderPattern(n);
        System.out.println("print increase Number Order pattern");
        increaseNumberPattern(n);
        System.out.println("Here Is Your Pyramid");
        increaseNumberPyramid(n);
        System.out.println("Here is your pyramid");
        increaseOneNumberColumnPyramin(n);
        System.out.println("Here is your pyramid");
        increaseDecreaseNumberPyramid(n);

    }

    // print simple pattern * * * * *
    public static void simplePattern(int n){
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
 /* print 3*3 pattern * * *
                      * * *
                      * * *      */
    public static void rowColumnSamePattern(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 /*         *         print increase order pattern
            **
            ***
            ****
            *****      */
    public static void increaseOrderPattern(int n){
        int stp=1;
     for(int i=0;i<n;i++){
         for(int j=0;j<stp;j++){
             System.out.print("*");
         }
         stp++;
         System.out.println();
     }
    }

    public static void increaseNumberPattern(int n){
        int stp=1;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<stp;j++){
                System.out.print(count+" ");
                count=count+1;
            }
            stp++;
            System.out.println();
        }
    }
//                     1
//                    2 2
//                   3 3 3
//                  4 4 4 4
//                 5 5 5 5 5
    public static void increaseNumberPyramid(int n){
        int rowCount=1;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rowCount;k++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
//                     1
//                    1 2
//                   1 2 3
//                  1 2 3 4
//                 1 2 3 4 5

    public static void increaseOneNumberColumnPyramin(int noOfRows){
        int rowCount=1;
        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //Printing 'j' value at the end of each row
            for (int k = 1; k <= rowCount; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }
    public static void increaseDecreaseNumberPyramid(int n){
        int rowCount=1;
        for(int i=n;i>0;i--){
            for(int j=1;j<i*2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rowCount;k++){
                System.out.print(k+" ");
            }
            for(int l=rowCount-1;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
            rowCount++;
        }
    }

}
