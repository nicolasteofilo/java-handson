import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber, secondNumber;

        System.out.print("First Number: ");

        firstNumber = input.nextDouble();
        System.out.print("Second Number: ");
        secondNumber = input.nextDouble();

        System.out.println("========== RESULTS ==========");

        double sum = firstNumber + secondNumber;
        System.out.printf("Sum = %.2f\n", sum);

        double average = (firstNumber + secondNumber) / 2;
        System.out.printf("Average = %.2f\n", average);

        double squareRootFirstNumber = Math.pow(firstNumber, 2);
        double squareRootSecondNumber = Math.pow(secondNumber, 2);

        System.out.println("Square Root of First Number: " + squareRootFirstNumber);
        System.out.println("Square Root of Second Number: " + squareRootSecondNumber);

        double powerOfFirstOfSecondNumber = Math.pow(firstNumber, secondNumber);
        double powerOfSecondOfFirstNumber = Math.pow(secondNumber, firstNumber);

        System.out.println("Power of First Of Second Number: " + powerOfFirstOfSecondNumber);
        System.out.println("Power of First Of Second Number: " + powerOfSecondOfFirstNumber);
    }
}