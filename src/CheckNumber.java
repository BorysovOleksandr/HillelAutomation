package HillelAuto;

import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число:");
        int input = scanner.nextInt();

        if (input > 0){
            System.out.println(input + " - додатне число");
        } else {
            System.out.println(input + " - від'ємне число");
        }

        if (input % 2 == 0) {
            System.out.println(input + " - парне число");
        } else {
            System.out.println(input + " - непарне число");
        }

        int temp;
        boolean number = true;
        if (input > 1) {
            for (int i = 2; i <= input / 2; i++) {  /* Також, в циклі фор, в задачі по числу,
                                                        визначення на просте число чи ні, можна робити break;
                                                        як тільки виявлено, що воно не просте,
                                                        щоб не йти по циклу далі.
                                                        Тогда надо добавить еще один ИФ если
                                                        число не просте, и после него БРЕЙК*/
                temp = input % i;
                if (temp == 0) {
                    number = false;
                }
            }
            if (number) {
                System.out.println(input + " - просте число");
            } else {
                System.out.println(input + " - складене число");
            }
        }
    }
}