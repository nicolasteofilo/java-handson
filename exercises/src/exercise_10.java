import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = sc.nextDouble();

        System.out.print("Enter the second number: ");
        y = sc.nextDouble();

        double[] numbers = new double[2];
        if (y > x) {
            numbers[0] =  y;
            numbers[1] = x;
        } else {
            numbers[0] = x;
            numbers[1] = y;
        }

        boolean isMultiple = numbers[0] % numbers[1] == 0;
        if (isMultiple) {
            System.out.println("Is multiple");
        } else {
            System.out.println("Is not multiple");
        }
    }
}
