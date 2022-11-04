package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.items.Item;

import java.util.List;
import java.util.Random;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        if (items.isEmpty())
            return false;

        System.out.println("Your DHL delivery package number: "+new Random().nextInt(9999));
        return true;
    }
}
