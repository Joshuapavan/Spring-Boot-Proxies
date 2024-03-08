package com.joshuapavan.springbootproxies.repositories;

import com.joshuapavan.springbootproxies.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Product, Long> {
}
