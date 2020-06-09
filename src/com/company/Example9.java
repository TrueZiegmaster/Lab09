package com.company;

public class Example9 {
    Example9(){
        System.out.println(m());
    }
    public static int m(){
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
}
