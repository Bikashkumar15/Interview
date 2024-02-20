package com.gfg.practice;

public class Sum {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] intarr=new int[]{1,2,3,5};
        int n=5;
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+intarr[i];
        }
        System.out.println("missiong no."+ (totalsum-sum));
    }
}
