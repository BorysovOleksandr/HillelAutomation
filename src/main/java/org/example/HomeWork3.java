package org.example;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String args[]) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість годин на тиждень");
        float hours = scanner.nextFloat();
        //int hours = scanner.nextInt();
        System.out.println( "Введіть річну зарплатню з податками");
        float salary = scanner.nextFloat();
        //int salary = scanner.nextInt();
        System.out.println( "Введіть податок, %");
        float tax = scanner.nextFloat();
        //int tax = scanner.nextInt();
      float weekSal = salary / 48;
      float hourTax = weekSal / hours;
      float hour = (hourTax * 100)/(100 - tax);
        System.out.println( "При " + hours + " робочих годин на тиждень з річною зарплатею в " + salary + " та податком " + tax + "%"
                + " година часу коштує " + hour + " одиниць");
    }

}
