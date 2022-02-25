package com.productservice.product.controller;

import com.productservice.product.model.product;
import com.productservice.product.productRepository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class productController {
    @Autowired
    productRepository productrepository;

    @GetMapping(value = "/product")
    public List<product> getAllProduct(){
        List<product> productList = productrepository.findAll();
        return  productList;

    }

    @GetMapping(value = "/product/{id}")
    public Optional getProductById(@PathVariable Integer id) {
        Optional p = null;
        if (productrepository.findById(id).isPresent()) {
            p = productrepository.findById(id);
        }
        return p;
    }
}
