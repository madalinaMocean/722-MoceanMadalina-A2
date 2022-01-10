package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    public List<Order> sortListOrder(List<Order> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Order::getTotalPrice))
                .collect(Collectors.toList());
    }

    public List<Order> filterOrderByProduct(List<Order> list, Product product) {
        return list.stream()
                .filter(order -> order.getProductList().contains(product))
                .collect(Collectors.toList());
    }
}
