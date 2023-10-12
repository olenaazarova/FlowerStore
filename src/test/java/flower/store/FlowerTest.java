package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.store.flow.Flower;
import flower.store.flow.FlowerColor;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());

        price = 0;
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.BLUE;
        flower.setColor(color);
        Assertions.assertEquals("#0000FF", flower.getColor());

        color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

}