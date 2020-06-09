package com.company;

public class Example7 {
    Example7(){
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
