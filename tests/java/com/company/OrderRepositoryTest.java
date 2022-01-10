package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    List<Order> orderList=new ArrayList<Order>();

    OrderRepository orderRepository=new OrderRepository(orderList);


    @Test
    void add() throws Exception {

        Order order1=new Order(1,30,"Brassai",new ArrayList<Product>());
        Order order2=new Order(2,50,"Avram",new ArrayList<Product>());
        orderRepository.add(order1);
        orderRepository.add(order2);
        assert(orderRepository.OrderList.size()==2);

    }

    @Test
    void delete() throws Exception {
        Order order1=new Order(1,30,"Brassai",new ArrayList<Product>());
        Order order2=new Order(2,50,"Avram",new ArrayList<Product>());
        orderRepository.add(order1);
        orderRepository.add(order2);
        orderRepository.delete(order1);
        assert(orderRepository.OrderList.size()==1);

    }

    @Test
    void update() throws Exception {
        Order order1=new Order(1,30,"Brassai",new ArrayList<Product>());
        Order order2=new Order(2,50,"Avram",new ArrayList<Product>());
        orderRepository.add(order1);
        orderRepository.update(order2,1);
        //assert(orderRepository.findAll()[0].getAdress()=="Avram");
    }

    @Test
    void findById() throws Exception {
        Order order1=new Order(1,30,"Brassai",new ArrayList<Product>());
        Order order2=new Order(2,50,"Avram",new ArrayList<Product>());
        orderRepository.add(order1);
        orderRepository.add(order2);
        assert(Objects.equals(orderRepository.findById(1).getAdress(), order1.getAdress()));

    }

    @Test
    void findAll() throws Exception {

    //iterable

    }

    @Test
    void getAll() throws Exception {

        Order order1=new Order(1,30,"Brassai",new ArrayList<Product>());
        Order order2=new Order(2,50,"Avram",new ArrayList<Product>());
        orderRepository.add(order1);
        orderRepository.add(order2);
        assert(orderRepository.getAll().size()==2);
    }
}