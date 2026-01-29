package application;

import entities.Triangle;

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

        Triangle xTriangle, yTriangle;
        xTriangle = new Triangle();
        yTriangle = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        xTriangle.a = sc.nextDouble();
        xTriangle.b = sc.nextDouble();
        xTriangle.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yTriangle.a = sc.nextDouble();
        yTriangle.b = sc.nextDouble();
        yTriangle.c = sc.nextDouble();

        double pX = (xTriangle.a + xTriangle.b + xTriangle.c) / 2;
        double pY = (yTriangle.a + yTriangle.b + yTriangle.c) / 2;

        double areaX = Math.sqrt(pX * (pX - xTriangle.a) * (pX - xTriangle.b) * (pX - xTriangle.c));
        double areaY = Math.sqrt(pY * (pY - yTriangle.a) * (pY - yTriangle.b) * (pY - yTriangle.c));

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
