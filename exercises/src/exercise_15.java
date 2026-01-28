import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        boolean isInvalidNumber = number > 1000 || number < 1;

        while (isInvalidNumber) {
            System.out.println("Please enter a number between 1 and 1000!");
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            isInvalidNumber = number > 1000 || number < 1;
        }

        System.out.println("Odd numbers are:");
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            boolean iIsOdd = !(i % 2 == 0);
            if (iIsOdd) oddNumbers.add(i);
        }

        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.println(oddNumbers.get(i));
        }
    }
}
