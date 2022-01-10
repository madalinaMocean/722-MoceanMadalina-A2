package com.company;

import java.util.List;

public class Order {
    private int Id; //identifiable
    private int OrderNumber;
    private String Adress;
    private List<Product> ProductList;

    public Order(int id, int orderNumber, String adress, List<Product> productList) {
        Id = id;
        OrderNumber = orderNumber;
        Adress = adress;
        ProductList = productList;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public List<Product> getProductList() {
        return ProductList;
    }

    public void setProductList(List<Product> productList) {
        ProductList = productList;
    }

}
