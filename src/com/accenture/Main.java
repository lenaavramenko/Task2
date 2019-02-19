package com.accenture;

public class Main {

    public static void main(String[] args) {
        String[] message= {"H", "E", "L", "L", "O", " ", "W", "O", "R", "L", "D", "!"};
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
        System.out.println("----------");
        String hello = "Hello, World!";
        for (int j = 0; j < hello.length(); j++) {
            System.out.println(message[j]);
        }
    }
}
