package com.interview.preparation.GFG;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                GfG g=new GfG();
                System.out.println(g.palinArray(a,n));
            }

        }
    }
}
class GfG{
    public static int palinArray(int[] a,int n){
        for(int i=0;i<n;i++){
            int temp=a[i];
            int ne=0;
            while(temp>0){
                int last=temp%10;
                temp=temp/10;
                ne=(ne*10)+last;
            }
            if(a[i]!=ne){
                return 0;
            }
        }
        return 1;
    }
}
