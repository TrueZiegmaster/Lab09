package com.company;

public class Example2 {
    Example2(){
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); Ошибка, недостижимое выражение
        } catch (Exception e) {
            System.out.println("2 "+ e );
        }
        System.out.println("3");
    }
}
