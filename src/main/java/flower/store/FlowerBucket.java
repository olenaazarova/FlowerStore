package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double bucketPrice() {
        double totalPrice = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            totalPrice += flowerPack.getPrice();
        }
        return totalPrice;
    }

}