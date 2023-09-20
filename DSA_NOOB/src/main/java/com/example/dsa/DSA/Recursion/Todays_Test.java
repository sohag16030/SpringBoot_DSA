package com.example.dsa.DSA.Recursion;


public class Todays_Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int x = find_gcd(a, b);

    }

    private static int find_gcd(int a, int b) {
//        while (a > 0 && b > 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//
       if(b==0) return  a;
       return find_gcd(b,a%b);


    }
}
