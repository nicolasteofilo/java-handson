package entities;

import java.lang.String;

public class Product {
    public int id;
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProductToStock(int quantity) {
        this.quantity += quantity;
    }

    public String removeProductToStock(int quantity) {
        if(!(quantity > this.quantity)) {
            this.quantity -= quantity;
            return "Removed!";
        } else {
            return "The quantity to be withdrawn cannot exceed the quantity in stock.";
        }
    }

    public void viewData() {
        System.out.printf(this.toString() + "\n");
    }

    public String toString() {
        return "Product data: " + this.name + ", $" + String.format("%.2f", this.price) + ", " + this.quantity + " units. Total = $" + String.format("%.2f", this.totalValueInStock());
    }
}
