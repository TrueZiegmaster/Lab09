package com.company;

public class Example4 {
    Example4(){
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }
}
