package com.interview.preparation.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//    @Override
//    public String get() {
//        return "Hello Supplier";
//    }
//    public static void main(String[] args) {
//     //Supplier<String>   x =()->"Hello Supplier";
//        Supplier<String> supplier=new SupplierDemo();
//        System.out.println(supplier.get());
//    }
//}

//Using lamda expression
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String>   supplier =()->"Hello Supplier";
               System.out.println(supplier.get());
        List<String> list= Arrays.asList("a","b","c");
        System.out.println(list.stream().findAny().orElseGet(supplier));
        List<String> list1=Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(()->"null array"));


    }
}
