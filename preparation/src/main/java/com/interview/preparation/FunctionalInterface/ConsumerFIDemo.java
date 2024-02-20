package com.interview.preparation.FunctionalInterface;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFIDemo  {
    public static void main(String[] args) {
//        Consumer consumer = (t) -> System.out.println("Printing :" + t);
//        consumer.accept(10);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(t->System.out.println("Print :"+t));
    }

}



// Tradisonal Approach

//public class ConsumerFIDemo implements Consumer<Integer>  {
//    public static void main(String[] args) {
//        new ConsumerFIDemo().accept(10);
//            }
//
//    @Override
//    public void accept(Integer i) {
//       System.out.println("Printing :" + i);
//    }
//}
