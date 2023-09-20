package com.example.dsa.OOPS;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstFailList_FirstSafeList {
    public static void main(String[] args) {
        //fail-first list
        List<Integer> list = Arrays.asList(10,12,13,14);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int data =iterator.next();
           // System.out.println(data);
           // list.add(100);
        }
        // fail-safe list
        List list1 = new CopyOnWriteArrayList();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
            list1.add(100);
        }
        // System.out.println(list1.size());

        //fail-safe list

        // ConcurrentHashMap doesn't keep copy. Size is not increased.
        // ConcurrentHashMap can push data while iteration is on progress because it's push data on key-value pair. So no indexing issue will occure like CopyOnWirteArrayList ....
        //charactertics like HashTable

       ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
       concurrentHashMap.put(0,100);
       concurrentHashMap.put(1,101);
       concurrentHashMap.put(3,103);

       Iterator<Map.Entry<Integer, Integer>> itr = concurrentHashMap.entrySet().iterator();

       while(itr.hasNext())
       {
           System.out.println(itr.next());
           concurrentHashMap.put(2,102);
       }
        System.out.println(concurrentHashMap.size());
        System.out.println(concurrentHashMap);
    }
}
