package ua.edu.ucu.apps.demo;

import lombok.Getter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.items.Item;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    @Getter
    private List<Item> items = new LinkedList<>();
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
        this.items.remove(item);
    }

//    public static void main(String[] args) {
//
//        FlowerBucket flowerBucket1 = new FlowerBucket();
//        FlowerBucket flowerBucket2 = new FlowerBucket();
//        flowerBucket1.add(new FlowerPack(new Flower(TULIP, RED, 2.4, 10), 5));
//        flowerBucket1.add(new FlowerPack(new Flower(TULIP, BLUE, 2.4, 10), 5));
//        flowerBucket2.add(new FlowerPack(new Flower(CHAMOMILE, RED, 1, 20), 3));
//        flowerBucket2.add(new FlowerPack(new Flower(CHAMOMILE, BLUE, 1, 20), 3));
//
//        Order order = new Order();
//        order.addItem(flowerBucket1);
//        order.addItem(flowerBucket2);
//
//
//        Payment payment = new PayPalPaymentStrategy();
//        order.setPaymentStrategy(payment);
//
//        Delivery delivery = new DHLDeliveryStrategy();
//        order.setDeliveryStrategy(new DHLDeliveryStrategy());
//
//        payment.pay(order.calculateTotalPrice());
//        delivery.deliver(order.getItems());
//    }
}
