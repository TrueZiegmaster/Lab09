package com.company;

public class Example12 {
    Example12(){
        m(null,0.000001);
    }
    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
}
