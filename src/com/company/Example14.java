package com.company;

public class Example14 {
    Example14(String[] args){
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
    public static void m(int x) throws ArithmeticException{
        int h=10/x;
    }
}
