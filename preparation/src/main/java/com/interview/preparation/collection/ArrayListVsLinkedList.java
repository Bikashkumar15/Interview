package com.interview.preparation.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        arrayList.remove(3);
        System.out.println("ArrayList of Integer :"+arrayList);

        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=1;i<=10;i++){
            linkedList.add(i);
        }
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLastOccurrence("h");
        System.out.println("LinkedList of Integer :"+linkedList);
    }
}
