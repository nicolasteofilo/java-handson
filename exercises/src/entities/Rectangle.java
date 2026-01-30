package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt(this.width * this.width + this.height * this.height);
    }

    public String toString() {
        return String.format("Area = %.2f\nPerimeter = %.2f\nDiagonal = %.2f", area(), perimeter(), diagonal());
    }
}
