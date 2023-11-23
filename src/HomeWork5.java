import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] numbers = new int[args.length]; /*создаем массив интов длинной как в аргументах
                                                т.к аргументы воспринимаются как стринги*/
        for (int i=0; i< args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);  //заполняем массив numbers,преобразовывая аргументы в int
        }
        System.out.println(Arrays.toString(numbers));/*выводим на печать наш массив, переведя его в стрингу,
                                                       если бы ввели просто(numbers),
                                                       то вывелся бы номер ячейки памяти этого массива */
        Arrays.sort(numbers);
        System.out.println("Sorted arrays " + Arrays.toString(numbers));

        // для организации особой сортировки, которая нам нужна, создаем цикл
        int temp;
        int max;
        for (int i = 0; i < numbers.length -1; i++) {
            temp = i;
            max = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if(numbers[j]>max){
                    max = numbers[j];
                    temp = j;
                }

            }
            if(i != temp){
                numbers[temp] = numbers[i];
                numbers[i] = max;
            }
        }
System.out.println("Inverted arrays " + Arrays.toString(numbers));
    }

}
