package com.interview.preparation.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SwapArrayList {
    public static void main(String[] args) {
        System.out.println("Hello");

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);
       // intArray.add(7);
        System.out.println("actual index"+intArray);

        for(int i=0;i< intArray.size();i+=2){
            if(i+1<intArray.size())
            Collections.swap(intArray,intArray.get(i),intArray.get(i+1));
        }
        System.out.println("swap array"+intArray);
    }
}
