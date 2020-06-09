package com.company;

public class Example1 {
    Example1(){
        try{
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        }
        catch (RuntimeException e){
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
}
