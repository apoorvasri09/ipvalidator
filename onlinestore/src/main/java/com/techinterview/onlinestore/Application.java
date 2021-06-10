package com.techinterview.onlinestore;
import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.domain.SmartPhone;
import com.techinterview.onlinestore.service.ProductListProcessor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProductListProcessor pp = new ProductListProcessor();

        BackPack product = new BackPack("001", "Salt") ;
        product.setCapacity(11);
        product.setMaxContentWeight(22);
        SmartPhone smartPhone = new SmartPhone("002", "LG");
        smartPhone.setColor("blue");
        smartPhone.setNumberOfCPUs(2);
        smartPhone.setRamSize(512);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(smartPhone);

        System.out.println(pp.productListToString( null));
    }
}
