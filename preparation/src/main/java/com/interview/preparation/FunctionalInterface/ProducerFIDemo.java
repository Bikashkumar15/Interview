package com.interview.preparation.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Tradisnal approach

//public class ProducerFIDemo implements Predicate<Integer> {
//    @Override
//    public boolean test(Integer integer) {
//        if(integer%2==0){
//            return true;
//        }else {
//        return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new ProducerFIDemo().test(7));
//    }
//}


//Java lamda expression
public class ProducerFIDemo  {

    public static void main(String[] args) {

        Predicate<Integer> x=i->i%2==0;
        System.out.println(x.test(10));

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        //print even/odd no using steam()
        list.stream().filter(x).forEach(t-> System.out.println("Print even :"+t));
        list.stream().filter(i->i%2!=0).forEach(odd-> System.out.println("Pring odd :"+odd));

    }
}
