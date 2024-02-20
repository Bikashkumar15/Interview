package com.gfg.practice.stringprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="programming";
        System.out.println("Actual String : "+str);
        String duplicateString = removeDuplicate1(str);
        System.out.println("Removed duplicate character using lamda: "+duplicateString);
        String duplicateString2 = removeDuplicate2(str);
        System.out.println("Removed duplicate character using indexOf method : "+duplicateString2);
        String duplicateString3 = removeDuplicate3(str);
        System.out.println("Removed duplicate character using indexOf method : "+duplicateString3);


    }
    //using java 8 lamda
    public static String removeDuplicate1(String str){
        StringBuilder stringBuilder = new StringBuilder();
        str.chars().distinct().forEach(c->stringBuilder.append((char)c));
        return stringBuilder.toString();
    }
    // using indexOf() method
    public static String removeDuplicate2(String str){
        StringBuilder sb=new StringBuilder();
        boolean repeat=false;
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
                   int index=str.indexOf(ch,i+1);
                   if(index==-1){
                      sb.append(ch);
                   }
        }
        return sb.toString();
    }
    // using Set Collection interface
    public static String removeDuplicate3(String str){
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c:set){
            sb.append(c);
        }
        return sb.toString();
    }
}
