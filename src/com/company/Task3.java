package com.company;

import java.util.Scanner;

public class Task3 {

    Scanner scanner = new Scanner(System.in);

    Task3(){
        byte[] byteArray = getByteArray(5);
        System.out.println(getSum(byteArray));
    }

    public byte[] getByteArray(int size){
        byte[] result = new byte[size];
        for (int i = 0; i < size; i++){
            result[i] = scanner.nextByte();
        }
        return result;
    }

    public byte getSum(byte[] array){
        byte result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }

    //InputMismatchException
}
