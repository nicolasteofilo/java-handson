import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        System.out.println("======== WELCOME TO SUM PROGRAM ========");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double a = input.nextDouble();

        System.out.print("Please enter the second number: ");
        double b = input.nextDouble();

        double sum = a + b;
        System.out.printf("Result: %.2f\n", sum);
    }
}