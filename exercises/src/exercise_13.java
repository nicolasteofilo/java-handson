import java.util.Scanner;

public class exercise_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstHour, secondHour;
        int totalHoursOfGame;

        System.out.print("Please enter the first hour(0 - 23): ");
        firstHour = sc.nextInt();
        System.out.print("Please enter the second hour(0 - 23): ");
        secondHour = sc.nextInt();

        if (secondHour < firstHour) { // end in next day
            int hoursInFirstDay = 24 - firstHour;
            totalHoursOfGame = hoursInFirstDay + secondHour;
        } else { // end in same day
            totalHoursOfGame = secondHour - firstHour;
            if (totalHoursOfGame == 0) totalHoursOfGame = 24;
        }

        System.out.printf("The game duration is %dH!\n", totalHoursOfGame);

        sc.close();
    }
}
