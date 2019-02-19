package com.accenture;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        //factorial (7);

        Scanner read = new Scanner(System.in);
        System.out.print("Input number for factorial: ");
        int input = read.nextInt();
        System.out.println(factorial(input));
        System.out.println(recursiveFactorial(input));

    }

    private static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; //factorial = factorial * i
        }
        return factorial;
    }

    private static int recursiveFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }
}
