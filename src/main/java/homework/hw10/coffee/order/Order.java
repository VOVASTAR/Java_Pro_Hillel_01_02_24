package homework.hw10.coffee.order;

public class Order {

    private short orderNumber;
    private String clientName;

    public Order(short orderNumber, String clientName) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
    }

    public short getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
