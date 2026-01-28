import java.util.Scanner;

public class exercise_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();
        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        sc.close();
    }
}
