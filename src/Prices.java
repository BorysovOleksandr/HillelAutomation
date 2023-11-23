import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте кількість товару, яку ви хочете придбати:");
        int input = scanner.nextInt();
        if (input <= 10) {
            double prices = price * input;
            System.out.println("До сплати: " + prices);
        } else {
            if (input <= 20) {
                double prices = (price * input) - (price * input * 0.05);
                System.out.println("До сплати: " + prices);
            } else {
                if (input <= 30) {
                    double prices = (price * input) - (price * input * 0.1);
                    System.out.println("До сплати: " + prices);
                } else {
                    if (input > 80) {
                        double prices = (price * input) - (price * input * 0.13);
                        System.out.println("До сплати: " + prices);
                    }
                    else {
                        if (input <= 80){
                        int temp = input - 30;
                       int a = temp/10;
                        double percent = (12 + a * 0.4)/100;
                        double prices = (price * input) - (price * input * percent);
                        System.out.println("До оплати:" + prices);
                }
            }
                    }
                }
            }

        }

    }


