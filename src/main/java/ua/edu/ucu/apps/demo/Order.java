package ua.edu.ucu.apps.demo;

import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.items.Item;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    List<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Process started");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {

    }
}
