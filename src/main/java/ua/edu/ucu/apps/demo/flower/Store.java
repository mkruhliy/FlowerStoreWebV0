package ua.edu.ucu.apps.demo.flower;

import java.util.ArrayList;

public class Store {
    private ArrayList<FlowerBucket> inventory = new ArrayList<FlowerBucket>();

    public void add(FlowerBucket flowerBucket) {
        inventory.add(flowerBucket);
    }

    public ArrayList<FlowerBucket> search(FlowerBucket flowerBucket) {
        ArrayList<FlowerBucket> matchingBuckets = new ArrayList<FlowerBucket>();
        for (FlowerBucket availableBucket: inventory) {
            if (availableBucket.equals(flowerBucket)) {
                matchingBuckets.add(availableBucket);
            }
        }
        return matchingBuckets;
    }
}