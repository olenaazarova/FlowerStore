package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    private double packetPrice;

    public FlowerPack(Flower newFlower, int newQuantity) {
        flower = newFlower;
        quantity = newQuantity;
    }

    public double getPrice() {
        packetPrice = flower.getPrice() * quantity;
        return packetPrice;
    }
}
