package com.company;

public class Product {
    private int Id;
    private String ProductName;
    private int Price;

    public Product(int id, String productName, int price) {
        Id = id;
        ProductName = productName;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


}
