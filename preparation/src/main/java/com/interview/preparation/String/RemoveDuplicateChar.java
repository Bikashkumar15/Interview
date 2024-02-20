package com.interview.preparation.String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=scanner.nextLine();
        System.out.println("Using loop  : "+method1(str));
        System.out.println("Remove Instream distinct() method : "+method2(str));
        System.out.println("Using Set collection :" +method3(str));
    }
    //using loop
    public static String method1(String str){
       char[] chArr= str.toCharArray();
       StringBuilder stringBuilder=new StringBuilder();
       for(int i=0;i<chArr.length;i++){
           boolean repeated=false;
           for (int j=i+1;j<chArr.length;j++){
               if(chArr[i]==chArr[j]){
                   repeated=true;
                   break;
               }
           }
           if(!repeated){
               stringBuilder.append(chArr[i]);
           }

       }
       return stringBuilder.toString();

    }
    // using distinct() method
    public static String method2(String str){
        StringBuilder stringBuilder=new StringBuilder();
         str.chars().distinct().forEach(c->stringBuilder.append((char)c));
         return stringBuilder.toString();
    }
    // Using set collection
    public static String method3(String str){
        StringBuilder stringBuilder=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c:set){
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
