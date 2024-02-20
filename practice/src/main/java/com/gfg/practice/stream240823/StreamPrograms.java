package com.interview.preparation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Person {

    private String name;
    private Integer age;

    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
public class  StreamPrograms {

    public static void main(String[] args) {

//Write a program to filter out the even numbers from a list of integers using Java streams.
//Write a program to find the sum of all the elements in a list of integers using Java streams.
//Write a program to convert a list of strings to uppercase using Java streams.
//Write a program to remove the duplicate elements from a list of integers using Java streams.
//Write a program to find the average of all the numbers in a list of doubles using Java streams.
//Write a program to sort a list of strings in alphabetical order using Java streams.
//Write a program to find the maximum element in a list of integers using Java streams.
//Write a program to count the number of words in a list of strings using Java streams.
//Write a program to find the square of each number in a list of integers using Java streams.
//Write a program to check if all the elements in a list of strings start with a specific letter using Java streams.
//Write a program to find the second smallest element in a list of integers using Java streams.
//Write a program to group a list of persons by their age using Java streams.
//Write a program to find the average age of male persons in a list using Java streams.
//Write a program to find the longest string in a list of strings using Java streams.
//Write a program to find the product of all the elements in a list of integers using Java streams.
//Write a program to convert a list of strings to a map where the string is the key and its length is the value using Java streams.
//Write a program to find the sum of squares of all the even numbers in a list of integers using Java streams.
//Write a program to filter out the students who have scored more than 80% marks from a list of student objects using Java streams.
//Write a program to sort a list of objects based on a specific attribute using Java streams.
//Write a program to concatenate all the strings in a list using Java streams.

        List<Integer> numberList = Arrays.asList(1, 10, 9, 7, 8, 5, 6, 4, 3, 3, 5, 4);

        List<String> stringList = Arrays.asList("deepak", "rajat", "rajat", "bikasa", "gopal", "hari", "abcdefghij");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Deepak", 30, "Male"));
        personList.add(new Person("Gouri", 25, "Female"));
        personList.add(new Person("hari", 40, "Male"));
        personList.add(new Person("Gopal", 19, "Female"));
        personList.add(new Person("sita", 35, "Female"));
        personList.add(new Person("Bikasa", 27, "Male"));


        System.out.println(filterEvenNumberList(numberList));
        System.out.println(sumOfNumber(numberList));
        System.out.println(convertToUpperCase(stringList));
        System.out.println("remove duplicate"+removeDuplicateNumbers(numberList));
        System.out.println(findAverage(numberList));
        System.out.println(findSortString(stringList));
        System.out.println(maxElement(numberList));
        System.out.println("countnoofword:"+countNumberfWords(stringList));
        System.out.println(squareOfNumber(numberList));
        System.out.println(startWithS(stringList));
        System.out.println(secondSmallest(numberList));
        System.out.println(findMalePersonAverageAge(personList));
        System.out.println(findTheLongestString(stringList));
        System.out.println("list to map "+convertListToMap(stringList));
        System.out.println(sumOfSquareOfEvenNumber(numberList));
        List<Person> personList1 = findListOfPersonByAge(personList);
        personList1.forEach(person -> System.out.println(person.getName()));
        System.out.println("filter emp"+filterExp());
        System.out.println(countNoOfCharacterInEachWord(stringList));
        System.out.println(findMaleList(personList));


    }
    public static List<Person> addAge(List<Person> personList){
        List<Integer> x = personList.stream().map(a -> a.getAge() + 5).collect(Collectors.toList());
        
        return  personList;
    }

    public static List<Integer> countNoOfCharacterInEachWord(List<String> stringList){
        return stringList.stream().map(String::length).collect(Collectors.toList());

    }

    public static List<Integer> filterEvenNumberList(List<Integer> numberList) {
        return numberList.stream().filter(n->n%2 == 0).collect(Collectors.toList());
    }
    public static boolean filterExp(){
        IntStream.of(new int[]{1,5,6,323,4,2}).filter(value -> value>5).distinct().forEach(System.out::println);
        return false;
    }

    public static Integer sumOfNumber(List<Integer> numberList) {
        return numberList.stream().reduce((a, b) -> a+b).get();
    }

    public static List<String> convertToUpperCase(List<String> stringList) {
        return stringList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
    }

    public static Set<Integer> removeDuplicateNumbers(List<Integer> numberList) {
        Set<Integer> numberSet = new HashSet<>();
        return numberList.stream().filter(n->!numberSet.add(n)).collect(Collectors.toSet());
    }

    public static double findAverage(List<Integer> numList) {
        return numList.stream().mapToDouble(n -> n).average().orElse(0.0);
    }

    public static List<String> findSortString(List<String> stringList) {
        return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static Integer maxElement(List<Integer> numList) {
        return numList.stream().max(Integer::compareTo).get();
    }

    public static Map<String, Long> countNumberfWords(List<String> stringList) {
        return stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<Integer> squareOfNumber(List<Integer> numberList) {
        return numberList.stream().map(s->s*s).collect(Collectors.toList());
    }

    public static List<String> startWithS(List<String> stringList) {
        return stringList.stream().filter(s->s.startsWith("r")).collect(Collectors.toList());
    }

    public static Integer secondSmallest(List<Integer> numberList) {
        return numberList.stream().sorted().skip(1).findFirst().get();
    }

    public static List<Person> findListOfPersonByAge(List<Person> personList) {
        return personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());

    }

    public static double findMalePersonAverageAge(List<Person> personList) {
        return personList.stream().filter(s->s.getGender() == "Male").mapToDouble(s->s.getAge()).average().orElse(0.0);

    }
    public static List<String> findMaleList(List<Person> personList){
        return personList.stream().filter(p->p.getGender().equals("Male")).map(Person::getName).collect(Collectors.toList());
    }

    public static String findTheLongestString(List<String> stringList) {
        return stringList.stream().reduce((word1, word2) -> word2.length() > word1.length() ? word2 : word1).get();
    }

    public static Map<String, Integer> convertListToMap(List<String> stringList) {
        return stringList.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1));
    }

    public static Integer sumOfSquareOfEvenNumber(List<Integer> numberList) {
        return numberList.stream().filter(n -> n%2 == 0).map(n -> n * n).reduce(Integer::sum).get();
    }
}
