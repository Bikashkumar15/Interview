package com.interview.preparation.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCharOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        char[] chArr=str.toCharArray();
        for(char c:chArr){
            if(!map.containsKey(c))
            {
            map.put(c,1);
            }
            else {
                int cnt = map.get(c);
                map.put(c,cnt+1);
            }
        }
        System.out.println(map);
    }
}
