package com.company;

/**
 * The type Product.
 */
public class Product {
    private int Id;
    private String ProductName;
    private int Price;

    /**
     * Instantiates a new Product.
     *
     * @param id          the id
     * @param productName the product name
     * @param price       the price
     */
    public Product(int id, String productName, int price) {
        Id = id;
        ProductName = productName;
        Price = price;
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
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        ProductName = productName;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(int price) {
        Price = price;
    }


}
