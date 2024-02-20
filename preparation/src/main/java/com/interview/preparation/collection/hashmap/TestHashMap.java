package com.interview.preparation.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Double> map=new HashMap<>();
        map.put("bikash",284.34);
        map.put("prakash",33.545);
        map.put("martin",5503.44);
        map.put("teja",3002.453);
        map.put(null,null);
        map.put(null,493.34);
        map.put("jems",null);
        map.put("john",395.34);
        map.put("prakash",66.43);
        System.out.println("Hashmap values :"+map);
        System.out.println("Size of the map :"+map.size());
        System.out.println("The elements are :");
        Set set=map.keySet();
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key+":"+map.get(key));
        }
        System.out.println("value of teja is : "+map.get("teja"));
        System.out.println("get key by value is :"+getKeyByValue(map,3002.453));


        //Checking the map for a particular key/value

        System.out.println("Does this map has Chetan as key? "+map.containsKey("teja"));

        System.out.println("Does this map has 74.23 as value? "+map.containsValue(66.43));


    }
    public static <K,V> K getKeyByValue(Map<K,V> map,V value){
        for(Map.Entry<K,V> entry:map.entrySet()){
            if(value.equals(entry.getValue())){
                return entry.getKey();
            }
        }
        return null;
    }
}
