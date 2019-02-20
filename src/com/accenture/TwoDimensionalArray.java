package com.accenture;

import java.util.Random;
import java.util.Scanner;

/*
Create class TwoDimensionalArray
# input from user size of the array (length of row and columns)
# create method to fill array with random int
# twoDimensionalArray of int
# create method for  print array
# create method for minimal value
# create method for max value value
# create method for mean value
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input Arrays length of rows: ");
        int rowsOfAnArray = read.nextInt();
        System.out.print("Input Arrays length of columns: ");
        int columnsOfAnArray = read.nextInt();
        int[][] array = new int[rowsOfAnArray][columnsOfAnArray];
        int[][] filledArray = fillArray(array);
        printTwoDimensionalArray(filledArray);
        printMinimalValue(array);
        printMaximalValue(array);
        printMeanValue(array);

    }

    private static void printMinimalValue(int[][] array) {
        System.out.println();
        int minValue = array[0][0];
        for (int[] firstValue : array) {
            for (int secondValue : firstValue) {
                if (minValue >= secondValue) {
                    minValue = secondValue;
                }
            }
        }
        System.out.println("Minimal value: " + minValue);
    }

    private static void printMaximalValue(int[][] array) {
        int maxValue = array[0][0];
        for (int[] firstValue : array) {
            for (int secondValue : firstValue) {
                if (maxValue <= secondValue) {
                    maxValue = secondValue;
                }
            }
        }
        System.out.println("Maximal value: " + maxValue);
    }

    private static void printMeanValue(int[][] array){
        int sum = 0;
        for (int[] row: array){
            for (int entry : row){
                sum += entry;
            }
        }
        System.out.println("Mean Value: " + (sum / array.length * array[0].length));
    }

    private static void printTwoDimensionalArray(int[][] filledArray) {
        for (int[] rows : filledArray) {
            System.out.println();
            for (int entry : rows) {
                System.out.print(entry + "; ");
            }

        }
    }

    private static int[][] fillArray(int[][] array) {
        Random random = new Random();

        int rowsOfAnArray = array.length;
        System.out.println("Row Size: " + rowsOfAnArray);
        int columnsOfAnArray = array[0].length;
        System.out.println("Columns Size: " + columnsOfAnArray);
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < rowsOfAnArray) {
            secondIndex = 0;
            while (secondIndex < columnsOfAnArray) {
                array[firstIndex][secondIndex] = random.nextInt();
                secondIndex++;
            }
            firstIndex++;
        }
        return array;
    }


}
