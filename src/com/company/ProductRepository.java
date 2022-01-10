package com.company;


import java.util.Collection;
import java.util.List;

/**
 * The type Product repository.
 */
public class ProductRepository implements ICRUDRepository<Integer,Product>{
    /**
     * The Product list.
     */
    public List<Product> ProductList;

    /**
     * Instantiates a new Product repository.
     *
     * @param productList the product list
     */
    public ProductRepository(List<Product> productList) {
        ProductList = productList;
    }

    @Override
    public Product add(Product elem) throws Exception{
        if (this.ProductList.contains(elem)) {
            throw new Exception("element already exists" + elem);
        }
        else
            ProductList.add(elem);
        return elem;
    }

    @Override
    public void delete(Product elem) throws Exception{
        if(ProductList.contains(elem)) {
            ProductList.remove(elem);
        }
        else{
            throw new Exception("The list does not contain the element");
        }

    }

    @Override
    public void update(Product elem, Integer id) {
        for (Product product :
                ProductList) {
            if (product.getId()==id) {
                product.setProductName(elem.getProductName());
                product.setPrice(elem.getPrice());
            }
        }

    }

    @Override
    public Product findById(Integer id) {
        for (Product product:
                ProductList) {
            if(product.getId()==id)
                return product;
        }
        return null; //if it foes not exist
    }

    @Override
    public Iterable<Product> findAll() {
        return ProductList;

    }

    @Override
    public Collection<Product> getAll() {
        return ProductList;

    }
}
