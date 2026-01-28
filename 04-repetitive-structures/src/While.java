import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        int sum = x;

        while (x != 0) {
            System.out.print("Enter another number: ");
            x = sc.nextInt();
            sum += x;
        }

        System.out.printf("The sum of number is: %d\n", sum);

        sc.close();
    }
}
