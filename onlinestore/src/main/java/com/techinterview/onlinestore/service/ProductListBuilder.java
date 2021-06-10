package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;

public interface ProductListBuilder {
    public ProductListBuilder add(Product product);
    public String build();
}
