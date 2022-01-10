package com.company;



import java.util.Collection;
import java.util.List;

/**
 * The type Order repository.
 */
public class OrderRepository implements ICRUDRepository<Integer,Order>{
    /**
     * The Order list.
     */
    public List<Order> OrderList;

    /**
     * Instantiates a new Order repository.
     *
     * @param orderList the order list
     */
    public OrderRepository(List<Order> orderList) {
        OrderList = orderList;
    }

    @Override
    public Order add(Order elem) throws Exception{
        if (this.OrderList.contains(elem)) {
            throw new Exception("element already exists" + elem);
        }
        else
            OrderList.add(elem);
        return elem;
    }

    @Override
    public void delete(Order elem) throws Exception{
        if(OrderList.contains(elem)) {
            OrderList.remove(elem);
        }
        else{
            throw new Exception("The list does not contain the element");
        }

    }

    @Override
    public void update(Order elem, Integer id) {
        for (Order order :
                OrderList) {
            if (order.getId()==id) {
                order.setOrderNumber(elem.getOrderNumber());
                order.setAdress(elem.getAdress());
                order.setProductList(elem.getProductList());
            }
        }

    }

    @Override
    public Order findById(Integer id) {
        for (Order order:
                OrderList) {
            if(order.getId()==id)
                return order;
        }
        return null; //if it foes not exist
    }

    @Override
    public Iterable<Order> findAll() {
        return OrderList;

    }

    @Override
    public Collection<Order> getAll() {
        return OrderList;

    }
}