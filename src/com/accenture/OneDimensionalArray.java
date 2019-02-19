
package com.accenture;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {
        System.out.print("Input size of Array: ");
        Scanner read = new Scanner(System.in);
        int sizeOfAnArray = read.nextInt();
        long[] array = createRandomFilledArray(sizeOfAnArray);
        printAnArray(array);
        printMinimalValue(array);
        printMaximalValue(array);
        printMeanValue(array);

    }

    private static void printAnArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void printMinimalValue(long[] array) {
        long minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Arrays smallest value " + minValue);
    }

    private static void printMaximalValue(long[] array) {
        long maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Arrays biggest value " + maxValue);
    }

    private static void printMeanValue(long[] array){
        long sum = 0;
        for (long entry: array){
            sum += entry;
        }
        System.out.println("Mean Value: " + (sum / array.length));
    }

    private static long[] createRandomFilledArray(int size) {
        long[] array = new long[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextLong();
        }
        return array;
    }

}
