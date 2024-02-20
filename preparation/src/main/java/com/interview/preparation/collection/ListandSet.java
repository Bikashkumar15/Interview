package com.interview.preparation.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListandSet {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("bikash");
        stringList.add("akash");
        stringList.add("prkash");
        stringList.add("vikash");
        stringList.add("praksh");
        stringList.add("akash");
        System.out.println("List of Name:"+stringList);
        Set<String> stringSet=new HashSet<>();
        stringSet.add("bikash");
        stringSet.add("akash");
        stringSet.add("prakash");
        stringSet.add("vikash");
        stringSet.add("prakash");
        stringSet.add("akash");
        System.out.println("Set of Name:"+stringSet);
    }
}
;