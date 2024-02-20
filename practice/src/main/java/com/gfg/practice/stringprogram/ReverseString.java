package com.gfg.practice.stringprogram;

import java.io.StringWriter;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello java";
        System.out.println("Actual String is : "+str);
        String reverse1 = reverseString1(str);
        System.out.println("Reverse a String using toCharArray method : "+reverse1);
        String reverse2 = reverseString2(str);
        System.out.println("Reverse a String using charAt method : "+reverse2);

        String reverse3 = reverseString3(str);
        System.out.println("Reverse a String using StringBuilder reverse method : "+reverse3);
        String reverse4 = reverseString4(str);
        System.out.println("Reverse a String using StringBuffer reverse method : "+reverse4);
    }
    //using toCharArray();
    public static String  reverseString1(String str){
        StringBuilder rev= new StringBuilder();
        char[] chArr=str.toCharArray();
        for(int i=chArr.length-1;i>=0;i--){
            char c = chArr[i];
            rev.append(c);
        }
        return rev.toString();
    }
    //using charAt(int index)
    public static String reverseString2(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            char x = str.charAt(i);
            sb.append(x);
        }
        return sb.toString();
    }
    // using StringBuffer reverse() method
    public static String reverseString3(String str){
        StringBuilder sbl=new StringBuilder(str);
         return sbl.reverse().toString();
    }
    public static String reverseString4(String str){
        StringBuffer sb=new StringBuffer(str);
        return sb.reverse().toString();
    }

}
