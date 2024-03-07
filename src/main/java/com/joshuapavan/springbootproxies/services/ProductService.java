package com.joshuapavan.springbootproxies.services;

import com.joshuapavan.springbootproxies.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts(){
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Nike shoes",12f));
        products.add(new Product("Bata shoes", 10f));

        return products;
    }
}
