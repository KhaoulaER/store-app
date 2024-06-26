package com.example.store.entities;


public class Product {

    private String code;

    private String reference;

    private double prix;

    public Product() {
    }

    public Product(String code, String reference, double prix) {
        this.code = code;
        this.reference = reference;
        this.prix = prix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
