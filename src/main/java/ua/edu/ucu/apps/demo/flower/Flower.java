package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.items.Item;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowertype;

    public String getColor() {
        return color.toString();
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}