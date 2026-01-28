import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers to sum: ");
        int x = sc.nextInt();
        int sum = 0;

        for (int i = x; i > 0; i--) {
            System.out.print("Enter the number: ");
            int y = sc.nextInt();
            sum += y;
        }

        System.out.printf("The sum is: %d\n", sum);

        sc.close();
    }
}
