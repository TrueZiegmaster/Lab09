package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_CatchExceptions {

    Scanner scanner = new Scanner(System.in);

    Task1_CatchExceptions(){
        int[] integers;
        try {
            integers = setIntArray(10);
            System.out.println(countAveragePos(integers));
        }
        catch (InputMismatchException e) {
            System.out.println("Введен неверный тип данных");
        }
        catch (ArithmeticException e){
            System.out.println("Отсутствуют положительные числа");
        }
    }

    public int[] setIntArray(int size) throws InputMismatchException {
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public int countAveragePos(int[] array) throws ArithmeticException{
        int result = 0;
        int posCount = 0;
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] > 0){
                result += array[i];
                posCount++;
            }
        }
        return result/posCount;
    }

}
