package entities;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public void setSidesByUserInput(Scanner sc) {
        System.out.println("Enter the measures of triangle: ");
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        this.c = sc.nextDouble();
    }

    public double area() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public void printArea(String nameOfTriangle) {
        double area = this.area();
        System.out.printf("The area of triangle %s is %.4f\n", nameOfTriangle, area);
    }
}
