package com.interview.preparation.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {
    public static void main(String[] args) {
        List<Integer> IntergerList= Arrays.asList(1, 10, 9, 7, 8, 5, 6, 4, 3, 3, 5, 4);
        List<String> stringList = Arrays.asList("deepak", "rajat", "rajat", "bikasa", "gopal", "hari", "abcdefghij");
        getEvenNo(IntergerList);
        sumOfAll(IntergerList);


    }
    //WAP to filter out the even numbers from a list of integers using Java streams.
    public static void getEvenNo( List<Integer> list){
        List<Integer> x = list.stream().filter(n -> n % 2 == 0 && n > 5).sorted().collect(Collectors.toList());
        System.out.println(x);
    }
    // WAP to find the sum of all the elements in a list of integers using Java streams
    public static void sumOfAll( List<Integer> list){
        Integer x = list.stream().reduce((a, b) -> a + b).get();
        System.out.println(x);
    }
    //  WAP to convert a list of strings to uppercase using Java streams.

}
