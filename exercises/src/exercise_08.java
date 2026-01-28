import java.util.Scanner;
import java.lang.String;

public class exercise_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        double number = sc.nextDouble();
        String type;

        if (number < 0) {
            type = "Negative";
        } else {
            type = "Positive";
        }

        System.out.printf("This number is %s", type);

        sc.close();
    }
}
