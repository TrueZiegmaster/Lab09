package com.company;

import java.util.Scanner;

public class Task1 {

    Scanner scanner = new Scanner(System.in);

    Task1(){
        int[] integers = setIntArray(10);
        System.out.println(countAveragePos(integers));
    }

    public int[] setIntArray(int size){
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public int countAveragePos(int[] array){
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


    //InputMismatchException
    //ArithmeticException: / by zero
}
