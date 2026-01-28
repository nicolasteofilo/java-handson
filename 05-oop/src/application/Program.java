package application;

import java.util.Locale;
import java.util.Scanner;

/* Problema a ser resolvido
 *  - Fazer um programa para ler as medidas dos lados s de dois triângulos X e Y (supondo medidas válidas).
 *  - Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui uma maior área.
 *  - Deve ser usada a fórmula de Heron para obter a medida da área a partir dos lados de um determinado triângulo.
 */

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double xA, xB, xC;
        double yA, yB, yC;

        System.out.print("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.print("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double pY = (yA + yB + yC) / 2;

        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area is X");
        } else {
            System.out.println("Larger area is Y");
        }

        sc.close();
    }
}
