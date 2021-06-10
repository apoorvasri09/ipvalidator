package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.domain.SmartPhone;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ProductListProcessorTest extends TestCase {

    public void testProductListToString() {
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

        String result = pp.productListToString(list);
        assertEquals("Salt(001), maxContentWeight : 22.0, color : null, capacity : 11.0\n" +
                "LG(002), manufacturer : null, color : blue, numberOfCPUs : 2, ramSize : 512.0, screeResolution : null\n", result);
    }

    public void testEmptyList() {
        ProductListProcessor pp = new ProductListProcessor();
        List<Product> list = new ArrayList<>();
        String result = pp.productListToString(list);
        assertEquals("", result);
    }

    public void testNullInput() {
        ProductListProcessor pp = new ProductListProcessor();
        String result = pp.productListToString(null);
        assertNull(result);
    }
}