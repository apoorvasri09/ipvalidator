package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class BasicProductListBuilder implements ProductListBuilder{
    private final List<Product> productList = new ArrayList<>();

    @Override
    public BasicProductListBuilder add(Product product){
        productList.add(product);
        return this;
    }

    @Override
    public String build(){
        StringBuilder resultStringBuilder = new StringBuilder();
        for(Product product : productList) {
            resultStringBuilder.append(product.convertToString())
                    .append("\n");
        }
        return resultStringBuilder.toString();
    }
}
