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

        Triangle xTriangle = new Triangle();
        Triangle yTriangle = new Triangle();

        xTriangle.setSidesByUserInput(sc);
        yTriangle.setSidesByUserInput(sc);

        xTriangle.printArea("X");
        yTriangle.printArea("Y");

        if (xTriangle.area() > yTriangle.area()) {
            System.out.println("Larger area is X");
        } else {
            System.out.println("Larger area is Y");
        }

        sc.close();
    }
}
