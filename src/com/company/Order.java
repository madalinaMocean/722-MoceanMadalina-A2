package com.company;

import java.util.List;

/**
 * The type Order.
 */
public class Order {
    private int Id; //identifiable
    private int OrderNumber;
    private String Adress;
    private List<Product> ProductList;

    /**
     * Instantiates a new Order.
     *
     * @param id          the id
     * @param orderNumber the order number
     * @param adress      the adress
     * @param productList the product list
     */
    public Order(int id, int orderNumber, String adress, List<Product> productList) {
        Id = id;
        OrderNumber = orderNumber;
        Adress = adress;
        ProductList = productList;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return Id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        Id = id;
    }

    /**
     * Gets order number.
     *
     * @return the order number
     */
    public int getOrderNumber() {
        return OrderNumber;
    }

    /**
     * Sets order number.
     *
     * @param orderNumber the order number
     */
    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }

    /**
     * Gets adress.
     *
     * @return the adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * Sets adress.
     *
     * @param adress the adress
     */
    public void setAdress(String adress) {
        Adress = adress;
    }

    /**
     * Gets product list.
     *
     * @return the product list
     */
    public List<Product> getProductList() {
        return ProductList;
    }

    /**
     * Sets product list.
     *
     * @param productList the product list
     */
    public void setProductList(List<Product> productList) {
        ProductList = productList;
    }

    /**
     * Get total price int.
     *
     * @return the int
     */
    public int getTotalPrice(){
        int sum=0;
        for (Product product: getProductList()
             ) {
            sum+=product.getPrice();

        }
        return sum;
    }

}
