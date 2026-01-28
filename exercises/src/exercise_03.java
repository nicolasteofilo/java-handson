import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number(A): ");
        double A  = sc.nextDouble();

        System.out.print("Please enter the second number(B): ");
        double B  = sc.nextDouble();

        System.out.print("Please enter the third number(C): ");
        double C  = sc.nextDouble();

        System.out.print("Please enter the fourth number(D): ");
        double D  = sc.nextDouble();

        double firstMultiplication = A * B;
        double secondMultiplication = C * D;
        double diff = firstMultiplication - secondMultiplication;

        System.out.printf("RESULT => (A * B) - (C * D) = %.2f\n", diff);
    }
}
