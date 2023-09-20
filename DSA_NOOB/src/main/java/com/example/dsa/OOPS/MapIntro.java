package com.example.dsa.OOPS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIntro {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10, 12, 10, 12);
//        Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
////        Iterator<Integer> keySet = countMap.keySet().iterator();
//
//        for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        while (keySet.hasNext()) {
//            System.out.println(keySet.next());
//        }
        String str = "HelloWorld";

        Map<Integer,Long> coutRes =  str.chars()
                        .mapToObj(c->c)
                        .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        Iterator<Map.Entry<Integer, Long>> iterator = coutRes.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Long> entry = iterator.next();
            System.out.println(((char)entry.getKey().intValue()) +" "+entry.getValue());
        }
    }
}
