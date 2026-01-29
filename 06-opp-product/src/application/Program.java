package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Please enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Initial stock: ");
        int initialStock = sc.nextInt();

        product.name = name;
        product.quantity = initialStock;
        product.price = price;

        menu(sc, product);
    }

    public static void menu(Scanner sc, Product product) {
        System.out.println("========== MENU ==========");
        System.out.println("[1] - Add any quantity on stock");
        System.out.println("[2] - Remove any quantity from stock");
        System.out.println("[3] - View product data");
        System.out.println("[0] - Exit");
        System.out.print("You choice: ");

        int option = sc.nextInt();
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                System.out.print("Enter the number of products to be added in stock: ");
                int numberOfProductsToAdd = sc.nextInt();
                product.addProductToStock(numberOfProductsToAdd);
                clearConsole();
                System.out.println("Added!");
                product.viewData();
                menu(sc, product);
                break;
            case 2:
                System.out.print("Enter the number of products to be removed in stock: ");
                int numberOfProductsToRemove = sc.nextInt();
                String message = product.removeProductToStock(numberOfProductsToRemove);
                clearConsole();
                System.out.println(message);
                product.viewData();
                menu(sc, product);
                break;
            case 3:
                product.viewData();
                menu(sc, product);
                break;
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
