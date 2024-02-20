package com.gfg.practice.stringprogram;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="hello java";
        System.out.println("Actual string : "+str);
        String reverseEachString =reverseEachWord(str);
        System.out.println("Reverse Each word of a string :"+reverseEachString);

    }
    public static String reverseEachWord(String str){
       StringBuilder word= new StringBuilder();
        String[] sArr=str.split(" ");
            for(String s:sArr){
                StringBuilder revChar= new StringBuilder();
                 for (int j= s.length()-1;j>=0;j--){
                     revChar.append(s.charAt(j));
                    }
            word.append(revChar).append(" ");
            }
        return word.toString().toString();

    }
}
