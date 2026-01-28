import java.lang.String;
import java.util.Scanner;

public class exercise_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the numbers, separated by space: ");
        String[] numbersInString = sc.nextLine().split(" ");
        int[] numbers = new int[numbersInString.length];

        for (int i = 0; i < numbersInString.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }
        int largestNumber = max(numbers);
        System.out.printf("The largest number is %d\n", largestNumber);
        sc.close();
    }

    private static int max(int[] numbers) {
        int largestNumber = numbers[0];

        for(int number : numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (number > largestNumber) {
                    largestNumber = number;
                }
            }
        }

        return largestNumber;
    }
}
