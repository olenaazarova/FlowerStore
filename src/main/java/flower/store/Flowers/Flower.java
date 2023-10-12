// package flower.store;

// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
// public class Flower {
//     @Getter
//     private double sepalLength;
//     private FlowerColor color;
//     @Getter
//     private double price;
//     @Getter
//     private FlowerType flowerType;

//     public String getColor() {
//         return color.toString();
//     }

//     public Flower(Flower flower) {
//         this.sepalLength = sepalLength;
//         this.color = color;
//         this.price = price;
//         this.flowerType = flowerType;
//     }
// }
package flower.store.Flowers;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public void setPrice(int number) {
        price = number;
    }

    public String getColor() {
        return color.toString();
    }

}