import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.print("Type your age: ");
        int age = input.nextInt();
        System.out.print("Type your gender(M/F): ");
        char gender = input.next().charAt(0);
        String genderToString = gender == 'M' ? "Male" : "Female";


        System.out.printf("Welcome %s to the Java Word, your age is %d and your gender is %s\n", name, age, genderToString);
    }
}