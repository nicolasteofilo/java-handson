import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args) {
        System.out.println("======== WELCOME TO CIRCLE AREA PROGRAM ========");
        System.out.print("Please enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle is: %.4f\n", area);
    }
}
