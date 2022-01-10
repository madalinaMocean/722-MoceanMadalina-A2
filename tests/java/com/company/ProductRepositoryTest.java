package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    List<Product> productList=new ArrayList<Product>();

   ProductRepository productRepository=new ProductRepository(productList);

    @Test
    void add() throws Exception {
        Product product1=new Product(1,"Apa",3);

        productRepository.add(product1);
        assert(productRepository.ProductList.size()==1);

    }

    @Test
    void delete() {

    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void getAll() {
    }
}