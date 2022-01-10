package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Order service.
 */
public class OrderService {

    /**
     * Sort list order list.
     *
     * @param list the list
     * @return the list
     */
    public List<Order> sortListOrder(List<Order> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Order::getTotalPrice))
                .collect(Collectors.toList());
    }

    /**
     * Filter order by product list.
     *
     * @param list    the list
     * @param product the product
     * @return the list
     */
    public List<Order> filterOrderByProduct(List<Order> list, Product product) {
        return list.stream()
                .filter(order -> order.getProductList().contains(product))
                .collect(Collectors.toList());
    }
}
