import java.util.Arrays;

public class sumEvenOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));  // так мы выведем изначальный заданный массив
        int evenSum = 0;   // задали переменную четных
        int oddSum = 0;    // задали переменную нечетных
        for (int i = 0; i< args.length; i++){           // создали цикл для длины по длине массива аргументов для каждой i
            int number = Integer.parseInt(args[i]);     // преобразуем и-тый элемент в число
            if (number%2 == 0) {                // %а - это остаток от деления на число а
                evenSum += number;            // (evenSum += number)=(evenSum = evenSum + number)
            }else {
                    oddSum += number;
                }
            }
        System.out.println("Сумма четных = " + evenSum);  //получили сумму четных и нечетных чисел
        System.out.println("Сумма нечетных = " + oddSum);

        // Теперь сделаем сумму элементов массива аргументов, стоящих на четных и нечетных МЕСТАХ массива

        for(int i =0; i< args.length; i +=2){ /* i +=2 будет перескакивать через один, по четным местам
         если хотим скакать по нечетным местам, то в условии надо задать int i = 1 */
            System.out.println(args[i]);
        }
        }



    }

// for(int i =0; i< args.length; i ++){
//    if (i%2 == 0){                     ---деление на 2 без остатка, четная позиция
//    System.out.println(args[i]); }     ---выведутся элементы массива args с четных позиций
//   }
//
//
//