import entities.Rectangle;

import java.util.Scanner;

public class exercise_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the width of rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Please enter the height of rectangle: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.height = height;
        rectangle.width = width;

        System.out.println(rectangle.toString());

        sc.close();
    }
}
