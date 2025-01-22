package org.Exercise1Level1.Model;

import org.Exercise1Level1.Exceptions.EmptySellException;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> productList;
    private Double totalPrice;

    public Sale() {
        this.productList = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product){

        productList.add(product);

    }

    public Product getProduct(int index){

        return productList.get(index);

    }

    public Double totalPrice() throws EmptySellException {

        if (productList.isEmpty()) {
            throw new EmptySellException("In order to create a sale, add some products to the list");
        }

        for(Product product : this.productList){
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

}


