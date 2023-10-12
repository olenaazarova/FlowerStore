package flower.store.flow;

public class FlowerPack {
    private Flower flower;
    private int amount;

    private double packetPrice;

    public FlowerPack(Flower newFlower, int newAmount) {
        this.flower = newFlower;
        this.amount = newAmount;
    }

    public double getPrice() {
        packetPrice = flower.getPrice() * amount;
        return packetPrice;
    }
}