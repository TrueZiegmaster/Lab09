package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    Scanner scanner = new Scanner(System.in);
    Random RNG = new Random();
    int[][] matrix;

    Task2(){
        matrix = generateMatrix(3,3);
        getMatrixColumn(matrix);
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

    public int[] getMatrixColumn(int[][] matrix){
        int column = scanner.nextInt();
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix[0].length; i++){
            result[i] = matrix[i][column];
        }
        return result;
    }

    //InputMismatchException
    //ArrayIndexOutOfBoundsException
}
