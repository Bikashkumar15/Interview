package com.interview.preparation.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str=scanner.nextLine();
        System.out.println("Using toCharArray method: " +method1(str));
        System.out.println("Using charAt method : " +method2(str));
        System.out.println("Using StringBuilder : " +method3(str));
        System.out.println("Using StringBuffer : " +method4(str));
    }
    //Using toCharArray() method
    public static String method1(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chArr=str.toCharArray();
        for(int i=chArr.length-1;i>=0;i--){
            stringBuilder.append(chArr[i]);
        }
        return stringBuilder.toString();
    }
    // Using charAt() method
    public static String method2(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    //Using StringBuilder class
    public static String method3(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        return stringBuilder.reverse().toString();

    }
    //Using StringBuffer class
    public static String method4(String str) {
    StringBuffer stringBuffer=new StringBuffer(str);
    return stringBuffer.reverse().toString();
    }

}
