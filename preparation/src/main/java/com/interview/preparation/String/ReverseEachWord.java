package com.interview.preparation.String;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=scanner.nextLine();
        String[] sArr = str.split(" ");
        String revWord="";
        for(String s:sArr){
            String revChar="";
            for(int i=s.length()-1;i>=0;i--){
                revChar=revChar+s.charAt(i);
            }
            revWord=revWord+revChar+" ";
        }
        System.out.println(revWord);
    }
}
