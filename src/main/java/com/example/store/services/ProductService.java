package com.example.store.services;

import com.example.store.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    public ProductService() {
        Product p = new Product();
        p.setCode("pro123");
        p.setReference("SmartPhone");
        p.setPrix(2000);
        products.add(p);
        Product p1 = new Product();
        p1.setCode("pro123");
        p1.setReference("SmartPhone");
        p1.setPrix(2000);
        products.add(p1);
        Product p2 = new Product();
        p2.setCode("pro123");
        p2.setReference("SmartPhone");
        p2.setPrix(2000);
        products.add(p2);
    }

   public ArrayList<Product> getAll(){
        return products;
   }
   public Product getProduct(String code){
        for (Product p:products){
            if(p.getCode().equalsIgnoreCase(code)) return p;
        }
        return null;
   }
}
