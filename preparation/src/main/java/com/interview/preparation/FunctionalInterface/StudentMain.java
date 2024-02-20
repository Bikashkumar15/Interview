package com.interview.preparation.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> listOfStudents=new ArrayList<>();
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
    //Imagine an operation where you want only a list of “Mathematics” students from the above listOfStudents.
    // Let’s see how to do it using Predicate.
        Predicate<Student> studentPredicate=(Student student)->student.getSpecialization().equals("Mathematics");
        List<Student> mathematicsStudent=new ArrayList<>();
        for(Student student:listOfStudents){
            if(studentPredicate.test(student))
            {
                mathematicsStudent.add(student);
            }
        }
        System.out.println("Mathemetics Students are :"+mathematicsStudent);

        //displaying all students with their percentage.
        Consumer<Student> studentConsumer=(Student student)->{
            System.out.println(student.getName()+" : "+student.getPercentage());
        };
        for(Student student:listOfStudents){
            studentConsumer.accept(student);
        }


        //extracting only the names from listOfStudents
        Function<Student,String> studentStringFunction=(Student student)->student.getName();

        List<String> stringList=new ArrayList<>();
        for(Student student:listOfStudents){
            stringList.add(studentStringFunction.apply(student));
        }
        System.out.println("List of Name :"+stringList);

        //create a new Student record

        Supplier<Student> studentSupplier=()->new Student(1010,"Bikash",89.7,"Computers");
        listOfStudents.add(studentSupplier.get());

    }
}
