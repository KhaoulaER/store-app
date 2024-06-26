package com.example.store.controllers;

import com.example.store.entities.Product;
import com.example.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/all")
    public ArrayList<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("{code}")
    public Product getPerson(@PathVariable("code") String code) {
        return productService.getProduct(code);
    }
}
