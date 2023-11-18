import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Jon Keks", 1, 30000);
        employees[1] = new Employee("Kris Lo", 2, 20000);
        employees[2] = new Employee("Ron Git", 3, 26404);


        System.out.println("Сумма на зарплаты сотрудникам в месяц - " +
                (employees[0].getSalary() + employees[1].getSalary() + employees[2].getSalary()));


        int min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (min > employees[i].getSalary() ){
                min = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с min ЗП = " + min);

        int max = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Cотрудник с max ЗП = " + max);
        System.out.println();

        int sum = 0;
        int average = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            sum+= employees[i].getSalary();

        }
        average= sum/3;
        System.out.println("Cредняя ЗП = " + average);


    }
}
//