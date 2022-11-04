package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.items.Item;

import java.util.ArrayList;

@Getter
@Setter
public class FlowerBucket extends Item{
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}