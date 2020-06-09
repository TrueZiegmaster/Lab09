package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2_CatchExceptions {

    Scanner scanner = new Scanner(System.in);
    Random RNG = new Random();
    int[][] matrix;

    Task2_CatchExceptions(){
        try{
            matrix = generateMatrix(3,3);
            getMatrixColumn(matrix);
        }
        catch (InputMismatchException e){
            System.out.println("Неправильный тип данных");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Столбца с таким номером не существует");
        }
    }

    public int[][] generateMatrix(int sizeX, int sizeY){
        int[][] result = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++){
            for (int j = 0; j < sizeX; j++){
                result[i][j] = -100 + RNG.nextInt(201);
            }
        }
        return result;
    }

    public int[] getMatrixColumn(int[][] matrix) throws InputMismatchException, ArrayIndexOutOfBoundsException {
        int column = scanner.nextInt();
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix[0].length; i++){
            result[i] = matrix[i][column];
        }
        return result;
    }
}
