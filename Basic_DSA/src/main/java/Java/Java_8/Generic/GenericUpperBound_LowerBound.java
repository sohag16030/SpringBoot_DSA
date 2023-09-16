package Java.Java_8.Generic;

import java.util.List;

public class GenericUpperBound_LowerBound {
    public static void main(String[] args) {


    }
    // Upper Bound (extends): we can sue numbers type as Integer,double but not string
    public static double sumOfList (List< ? extends Number > numbers){
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
    // Lower Bounded Wildcards (? super T): we can sue Fruit type as Object,Food
    public void addFruits (List < ? super Fruit > basket){
        basket.add(new Fruit());
        basket.add(new Fruit());
    }

}
