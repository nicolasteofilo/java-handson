import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();

        double maxMinutesInPlan = 100;
        double valuePerMinute = 2.0;
        double valueToPay = 50.0;

        if (minutes <= maxMinutesInPlan) {
            System.out.printf("VALUE: $%.2f", valueToPay);
        } else {
            double over = (minutes - 100) * valuePerMinute;
            valueToPay += over;
            System.out.printf("VALUE: $%.2f", valueToPay);
        }
    }
}
