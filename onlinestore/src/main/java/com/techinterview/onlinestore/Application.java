package com.techinterview.onlinestore;
import com.techinterview.onlinestore.service.ProductListProcessor;

public class Application {
    public static void main(String[] args) {
        ProductListProcessor pp = new ProductListProcessor();
        System.out.println(pp.productListToString(null, null));
    }
}
