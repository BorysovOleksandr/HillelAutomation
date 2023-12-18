package org.example;

public class Salary {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double hourCost = Integer.parseInt(args[1]);
        double percent = Integer.parseInt(args[2]);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            double salary1 = 184 * hourCost;

            System.out.println("Зарплатня з податком " + salary1);
            double salary2 = salary1-salary1*percent/100;
            System.out.println("Зарплатня без податка " + salary2);
        } else {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                double salary1 = 176 * hourCost;

                System.out.println("Зарплатня з податком " + salary1);
                double salary2 = salary1-salary1*percent/100;
                System.out.println("Зарплатня без податка " + salary2);
            }

        }

    }


}