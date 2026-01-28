import java.util.Scanner;

public class exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstCode, firstNumberOfPieces, firstUniPrice;
        double secondCode, secondNumberOfPieces, secondUniPrice;
        System.out.print("Please enter the first product code number, the number of pieces, and the unit price for product 1, in that order respectively, separated by space: ");
        firstCode = sc.nextDouble();
        firstNumberOfPieces = sc.nextDouble();
        firstUniPrice = sc.nextDouble();

        System.out.print("Please enter the second product code number, the number of pieces, and the unit price for product 1, in that order respectively, separated by space: ");
        secondCode = sc.nextDouble();
        secondNumberOfPieces = sc.nextDouble();
        secondUniPrice = sc.nextDouble();

        double result = (firstNumberOfPieces * firstUniPrice) + (secondNumberOfPieces * secondUniPrice);
        System.out.printf("VALUE TO PAY: $%.2f\n", result);
    }
}
