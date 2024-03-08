package com.joshuapavan.springbootproxies.services;

import com.joshuapavan.springbootproxies.domain.Product;
import com.joshuapavan.springbootproxies.repositories.ProductsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductsRepo productsRepo;
    public List<Product> getAllProducts() {
        return productsRepo.findAll();
    }
}
