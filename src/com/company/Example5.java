package com.company;

public class Example5 {
    Example5(){
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }
        System.out.println("2");
    }
}
