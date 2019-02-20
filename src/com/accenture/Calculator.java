package com.accenture;
/*
* Create class Calculator
create main method
Output map of operations
Use switch!
if input is 1 create calculator that will + 2 values (a + b)
if input is 2 create calculator that will - 2 values ( a - b)
if 3 (a * b)
if 4( a / b)
of 0 close application
and after each calculation offer to to do next operation (recursion)*/
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter FIRST number: ");
        int a = input.nextInt();

        System.out.print("Enter SECOND number: ");
        int b = input.nextInt();

        System.out.println("Select OPERATION");
        System.out.println("Select 1 for a + b | or 2 for a - b | or 3 for a * b | or 4 for a / b | or 0 for close a program");

        char operator = input.next().charAt(0);
        switch(operator) {
            case '1' :
                System.out.println("a + b = " + (a + b));
                break;
            case '2' :
                System.out.println("a - b = " + (a - b));
                break;
            case '3' :
                System.out.println("a * b = " + (a * b));
                break;
            case '4' :
                System.out.println("a / b = " + (a / b));
                break;
            case '0' :
                System.out.println("CLOSE Application");
                return;
            default : System.out.println("Wrong input!");
        }

    }
}
