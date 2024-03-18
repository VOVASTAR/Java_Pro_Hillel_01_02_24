package homework.hw10.coffee.order;

import java.util.ArrayDeque;
import java.util.Queue;

public class CoffeeOrderBoard {

    private short orderCounter = 1;

    private Queue<Order> orderQueue = new ArrayDeque<>();

    public void add(String name) {
        orderQueue.offer(new Order(orderCounter++, name));
    }

    public void deliver() {
        Order order = orderQueue.poll();
        if (order == null) System.out.println("No orders");
    }

    public void deliver(short orderNumber) {
        boolean isCoffeeReady = false;
        for (Order order : orderQueue) {
            if (order.getOrderNumber() == orderNumber) {
                isCoffeeReady = orderQueue.remove(order);
                System.out.println("Take your order " + orderNumber);
                break;
            }
        }
        if (!isCoffeeReady) {
            if (orderNumber <= orderCounter) {
                System.out.println("You already have take your coffee");
            } else {
                System.out.println("You didn't make order");
            }
        }
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : orderQueue) {
            System.out.println(order.getOrderNumber() + " | " + order.getClientName());
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "orderQueue=" + orderQueue +
                '}';
    }
}
