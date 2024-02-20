package com.interview.preparation.stream240823;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Jcotd_II {
    public static void main(String[] args) {
         System.out.println("Unique Course"+removeduplicate());
        System.out.println("frequency of each character in a string"+frequencyOfEachCharacter());
        System.out.println("frequency of each String in a List"+frequencyOfEachString());
        reverseListOfDecimals();
        System.out.println("join the strings with , [ ] "+joinString());
        System.out.println("print the numbers which are multiples of 5 "+multiplesWithFive());
      maxandmin();
        mergeTwoUnsortedArray();
        max3AndMin3();
        anagramCheck();
        sumOfAllDigit();
        SecondLargest();
        increasingOrder();
        sumAndAvg();
        commonElement();
        reverseEachWord();
        sumOf10();
        ReverseIntArray();
        m1();



    }
public static void m1(){
        List<Integer> l1=Arrays.asList(1,2,3,2,3,5,6);


    System.out.println("remove duplicated "+l1.stream().distinct().collect(Collectors.toList()));
}
    //How do you remove duplicate elements from a list using Java 8 streams?
    public static List<String> removeduplicate(){
        List<String> listCourse= Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueCourse = listCourse.stream().distinct().collect(Collectors.toList());
        return uniqueCourse;
    }

    // How do you find frequency of each character in a string using Java 8 streams?
    public static Map<Character, Long> frequencyOfEachCharacter(){
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> charCountMap = inputString.chars()
                                            .mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charCountMap;
    }
   // How do you find frequency of each element in an array or a list?
    public static  Map<String, Long>  frequencyOfEachString(){
        List<String> stringList=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stringCountMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return stringCountMap;
    }
    //How do you sort the given list of decimals in reverse order?
    public static void reverseListOfDecimals(){
        List<Double> doubleList=Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> sortedList = doubleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list"+sortedList);

    }

    //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

    public static String joinString(){
        List<String> stringList=Arrays.asList("AA","BB","cc","DD","ee");
        String joinString = stringList.stream().collect(Collectors.joining(",", "[", "]"));
        return joinString;
    }
    // From the given list of integers, print the numbers which are multiples of 5?
    public static List<Integer> multiplesWithFive() {
        List<Integer> integerList = Arrays.asList(1, 3, 25, 35, 24, 38, 70);
        List<Integer> multiplesOfFive = integerList.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
        return multiplesOfFive;
    }

    //Given a list of integers, find maximum and minimum of those numbers?
    public static void maxandmin(){
        List<Integer> list=Arrays.asList(23,34,53,6,232,587,885,34,66);
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max Value"+max);
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min Value"+min);
    }

    //How do you merge two unsorted arrays into single sorted array using Java 8 streams?
    public static void mergeTwoUnsortedArray(){
        int[] a=new int[]{2,5,63,1,6};
        int[] b=new int[]{4,5,1,5,99};
        int [] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println("sorted array"+Arrays.toString(c));
        System.out.println("Remove duplicate from an array");
        int [] d=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println("unique sorted array"+Arrays.toString(d));
    }

//How do you get three maximum numbers and three minimum numbers from the given list of integers?
public static void max3AndMin3(){
        List<Integer> integerList=Arrays.asList(1,4,6,2,5,34,6,23,66,34,76);
    List<Integer> min3 = integerList.stream().sorted().limit(3).collect(Collectors.toList());
    List<Integer> max3 = integerList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
    System.out.println("Max 3 no.:"+max3);
    System.out.println("Min 3 no :"+min3);
    }
    //Java 8 program to check if two strings are anagrams or not?
    public static void anagramCheck(){
        String a="raceCar";
        String b="carRace";
        a=Stream.of(a.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        b=Stream.of(b.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(a.equals(b)){
            System.out.println("String is anagram");
                    }
        else {
            System.out.println("String is not anagram");
        }
    }


    //Find sum of all digits of a number in Java 8?

    public static void sumOfAllDigit(){
        int a=234564;
        Integer sumDigit=Stream.of(String.valueOf(a).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("Sum of Digits"+sumDigit);
    }

    //Find second largest number in an integer array?
    public static void SecondLargest(){
        List<Integer> integerList=Arrays.asList(1,3,5,3,6,7,4);
        Integer secondLargest = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest "+secondLargest);
    }
    // Given a list of strings, sort them according to increasing order of their length?
        public static void increasingOrder() {
            List<String> list=Arrays.asList("JAVA","C","C++","HTML","R");
            List<String> increasingOrder = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
            System.out.println("increasing Order"+increasingOrder);
    }
    //Given an integer array, find sum and average of all elements?
    public static void sumAndAvg(){
        int[] a=new int[]{2,5,3,6,4,6,4};
        int sum = Arrays.stream(a).sum();
        double avg=Arrays.stream(a).average().getAsDouble();
        System.out.println("Sum of integer "+sum);
        System.out.println("Avg of integer "+avg);

              }
    // How do you find common elements between two arrays?
    public static void commonElement(){
        List<Integer> list1=Arrays.asList(12,23,35,53,64,7,57);
        List<Integer> list2=Arrays.asList(64,7,57,33,5,6,2);
        List<Integer> commonElement = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("commonElement"+commonElement);
    }

    //Reverse each word of a string using Java 8 streams?
    public static void reverseEachWord(){
        String  str="Java concept of the day";
        String strReverse =Arrays.stream(str.split(" "))
                .map(word->new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("reverse String"+strReverse);
            }

    //How do you find sum of first 10 natural numbers?
    public static void sumOf10(){
        int sum=IntStream.range(1,11).sum();
        System.out.println("sum of 10 natural no."+sum);
    }
    //Reverse an integer array
    public static void ReverseIntArray(){
        int [] arr=new int[]{4,5,3,7,8,3,6};
        int [] revArr= IntStream.rangeClosed(1, arr.length)
                .map(i->arr[arr.length-i]).toArray();

        System.out.println("Reverse an integer of array: "+Arrays.toString(revArr));
    }

}
