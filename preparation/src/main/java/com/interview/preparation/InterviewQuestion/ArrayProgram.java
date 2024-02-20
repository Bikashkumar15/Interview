package com.interview.preparation.InterviewQuestion;

import java.lang.module.ModuleDescriptor;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayProgram {
    public static void main(String[] args) {
        Integer[] intArr={1,2,3,4,5,6,7,7,8};
        int[] arr=new int[]{1,2,3,4,5,6,7,7,8};
        int x = Arrays.stream(arr).reduce((a, b) -> a + b).getAsInt();
        System.out.println("int sum"+x);


        Integer sum = Arrays.stream(intArr).reduce((a, b) -> a + b).get();
        ;
        System.out.println(sum);
        long duplicate = Arrays.stream(intArr).distinct().count();
        System.out.println("duplicate"+duplicate);
        Map<Integer, Long> duplicateCount = Arrays.stream(intArr)
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));
        System.out.println("Duplicate Count"+duplicateCount);
        List<Integer> removeDuplicate = Arrays.stream(intArr).distinct().collect(Collectors.toList());
        System.out.println("removed duplicate"+removeDuplicate);
        Integer[] numbers = {2, 3, 5, 2, 7, 5, 8, 9, 2, 7};

        Set<Integer> uniquSet=new HashSet<>();
        Set<Integer> duplicateSet=new HashSet<>();

        for(Integer no:numbers){
            if(!uniquSet.add(no))
            duplicateSet.add(no);
        }
        System.out.println("Duplicate set"+duplicateSet);

        uniquSet.removeAll(duplicateSet);
        System.out.println("Unique Set"+uniquSet);



    }
}
