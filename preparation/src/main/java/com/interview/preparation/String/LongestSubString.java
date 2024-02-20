package com.interview.preparation.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        String longestSubString="";
        int subStringLength=0;
        Map<Character,Integer> map=new HashMap<>();
        char[] chArr=str.toCharArray();
        for(int i=0;i<chArr.length;i++){
             char c=chArr[i];
             if(!map.containsKey(c)){
             map.put(c,i);}
             else {
                 i=map.get(c);
                 map.clear();
             }
             if(map.size() >subStringLength){
                 subStringLength=map.size();
                 longestSubString=map.keySet().toString();
             }

        }
        System.out.println("Longest Substring is : " +longestSubString);
    }


}
