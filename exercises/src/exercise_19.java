import entities.Employee;

import java.util.Scanner;

public class exercise_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the name of employee: ");
        String name = sc.nextLine();
        System.out.print("Please enter the gross salary of employee: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Please enter the tax of salary: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee();
        employee.name = name;
        employee.grossSalary = grossSalary;
        employee.tax = tax;
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase: ");
        double percentageToIncrease = sc.nextDouble();
        employee.increaseSalary(percentageToIncrease);
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
