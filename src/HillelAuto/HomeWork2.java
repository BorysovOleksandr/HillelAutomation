package HillelAuto;

public class HomeWork2 {
    public static void main(String args[]) {
        int hours = Integer.parseInt(args[0]);
        int hourCost = Integer.parseInt(args[1]);
        int tax = Integer.parseInt(args[2]);
        int monthSalary = hours * hourCost * 4;
        System.out.println ("Зарплатня на місяць без податків: " + monthSalary);
        int a = monthSalary / 100 * tax;
        int monthSalaryTax = monthSalary - a;
        System.out.println ("Зарплатня на місяць з податком: " + monthSalaryTax);
        System.out.println ("Зарплатня на рік без податків: " + (monthSalary * 12));
        System.out.println ("Зарплатня на рік з податком: " + (monthSalaryTax * 12));
    }
}
