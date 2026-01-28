import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of employee: ");
        int employeeNumber = sc.nextInt();

        System.out.print("Please enter the number of hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Please enter the number of price per hour: ");
        double pricePerHour = sc.nextDouble();

        double salary = hoursWorked * pricePerHour;

        System.out.printf("The salary of employee of number %d is $%.2f\n", employeeNumber, salary);
    }
}
