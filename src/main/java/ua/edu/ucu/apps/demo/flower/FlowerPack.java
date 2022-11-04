package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.items.Item;

@Getter
@Setter
@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}