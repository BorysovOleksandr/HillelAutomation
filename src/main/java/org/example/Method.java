package org.example;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        Scanner scanner = new Scanner(System.in);

       System.out.println("Give me first number");
       int firstInputNumber = scanner.nextInt();
        System.out.println("Give me second number");
        int secondInputNumber = scanner.nextInt();

       System.out.println(sum(firstInputNumber, secondInputNumber));
       System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    static int sum(int firstNumber, int secondNumber){
        int result = 0;
        result = firstNumber + secondNumber;
        return result;
    }
}
