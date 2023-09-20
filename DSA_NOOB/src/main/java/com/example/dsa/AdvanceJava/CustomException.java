package com.example.dsa.AdvanceJava;

public class CustomException extends RuntimeException {
    public CustomException(String message) throws Exception {
        super(message);
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        int age = 14;
        if (age > 10) {
           throw new CustomException("Age is invalid");
        }
        System.out.println("Hello");
    }
}

