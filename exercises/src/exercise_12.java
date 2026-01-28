import java.lang.String;
import java.util.Scanner;

public class exercise_12 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of week(1-7): ");
        int numberOfDay = sc.nextInt();
        String day;

        switch (numberOfDay) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default: {
                day = "Invalid day";
                break;
            }
        }
        System.out.printf(ANSI_RED + "The day of week is: %s\n", day + ANSI_RESET);
        sc.close();
    }
}
