package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.items.Item;

@AllArgsConstructor
@Setter
@Getter
public class Flower extends Item {
    private FlowerType flowertype;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    @Override
    public String getDescription() {
        return "Flower{" +
                "flowertype=" + flowertype +
                ", color=" + color +
                ", sepalLength=" + sepalLength +
                ", price=" + price +
                '}';
    }

//    public static void main(String[] args) {
//        Item tulip = new Flower(TULIP, RED, 2.4, 10);
//        System.out.println(tulip.getDescription());
//    }
}