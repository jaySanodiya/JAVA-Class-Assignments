package com.week3.Thursday.Question1;

import java.util.Comparator;

public class productPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getProductPrice()>p2.getProductPrice()){
            return +1;
        }
        else if(p1.getProductPrice()<p1.getProductPrice()){
            return -1;
        }
        else return 0;
    }
}

class productName implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}

class productId implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getProductId()>p2.getProductId()){
            return +1;
        }
        else if(p1.getProductId()<p2.getProductId()){
            return -1;
        }
        else return 0;
    }
}