package org.Exercise1Level1.Main;

import org.Exercise1Level1.Exceptions.EmptySellException;
import org.Exercise1Level1.Model.Product;
import org.Exercise1Level1.Model.Sale;

public class Main {

    public static void main(String[] args) {

        Product milk = new Product("milk", 1.5);
        Product chocolate = new Product("chocolate", 2.5);
        Product oliveOil = new Product("olive oil", 5.5);
        Product coffeeBeans = new Product("coffee beans", 3.5);
        Product bread = new Product("bread", 1.2);

        Sale sale = new Sale();

        try {
            System.out.println("Total value of sale: " + sale.totalPrice());
        } catch (EmptySellException e) {
            System.out.println(e.getMessage());
        }

        try {
            sale.addProduct(milk);
            System.out.println(sale.getProduct(1).getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

}
