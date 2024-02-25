package homework_13.coffe.order;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
        nextOrderNumber = 1;
    }
    public void add(String name) {
        int orderNumber = nextOrderNumber++;
        orders.add(new Order(orderNumber, name));
    }
    public Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("No orders to deliver.");
            return null;
        }
        return orders.remove(0);
    }
    public Order deliver(int orderNumber) {
        for (Iterator<Order> iterator = orders.iterator(); iterator.hasNext();) {
            Order order = iterator.next();
            if (order.getNumber() == orderNumber) {
                iterator.remove();
                return order;
            }
        }
        System.out.println("Order with number " + orderNumber + " not found.");
        return null;
    }
    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
