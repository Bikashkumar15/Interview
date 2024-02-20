
package com.interview.preparation.stream240823;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Jcotd_I {
    public static void main(String[] args) {
        List<Integer> listNo= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenList = listNo.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Odd even Map"+oddEvenList);
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenList.entrySet();
        for (Map.Entry<Boolean,List<Integer>> entry:entrySet){
            System.out.println(("-------------------"));
            if(entry.getKey()){
                System.out.println("Even no.");
            }
            else {
                System.out.println("Odd no.");
            }
            List<Integer> list=entry.getValue();
            for (int i:list){
                System.out.println(i);
            }
        }
    }
}
