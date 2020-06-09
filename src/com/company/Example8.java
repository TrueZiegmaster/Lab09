package com.company;

public class Example8 {
    Example8(){
        System.out.println(m());
    }
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
}
