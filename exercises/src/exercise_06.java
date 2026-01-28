import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A, B and C number, respectively, separated by space: ");
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double PI = Math.PI;

        double areaRightTriangle = (A * C) / 2;
        double areaOfCircleWithRadioC = PI * Math.pow(C, 2);
        double areaTrapeze = ((A + B) * C) / 2;
        double areaSquare = Math.pow(B, 2);
        double areaRetangle = A * B;

        System.out.printf("TRIANGLE: %.2f\n", areaRightTriangle);
        System.out.printf("CIRCLE: %.2f\n", areaOfCircleWithRadioC);
        System.out.printf("TRAPEZE: %.2f\n", areaTrapeze);
        System.out.printf("SQUARE: %.2f\n", areaSquare);
        System.out.printf("RETANGLE: %.2f\n", areaRetangle);
    }
}
