package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_CatchExceptions {
    Scanner scanner = new Scanner(System.in);

    Task3_CatchExceptions(){
        try{
            byte[] byteArray = getByteArray(5);
            System.out.println(getSum(byteArray));
        }
        catch (InputMismatchException e){
            System.out.println("Введен неправильный тип данных или значение, превышающее максимальное для этого типа");
        }
    }

    public byte[] getByteArray(int size){
        byte[] result = new byte[size];
        for (int i = 0; i < size; i++){
            result[i] = scanner.nextByte();
        }
        return result;
    }

    public byte getSum(byte[] array) throws InputMismatchException {
        byte result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }
}
