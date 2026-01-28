import java.util.Scanner;

public class exercise_17 {
    public static void main(String[] args) {
        int n1 = 89; // 01011001
        int n2 = 60; // 01100000

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // I want to test if the sixth bit of the integer that the user entered is 1 or 0.
        int mask = 0b100000;
        if((n & mask) != 0) {
            System.out.println("6th is true");
        } else {
            System.out.println("6th is false");
        }
        sc.close();
    }
}
