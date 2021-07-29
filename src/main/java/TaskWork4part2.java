import sweets.Sweets;
import sweets.Candy;
import sweets.Chocolate;
import sweets.Jellybean;

public class TaskWork4part2 {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Yum", 300, 160, "salty");
        Jellybean jellybean1 = new Jellybean("Mamba", 400, 200, 2);
        Chocolate chocolate1 = new Chocolate("Alpen Gold", 70, 64.99,"black");
        Chocolate chocolate2 = new Chocolate("Alyonka", 70, 74.99,"white");
        Sweets[] present = {candy1, jellybean1, chocolate1, chocolate2};
        double sumWeight = 0, sumPrice = 0;
        for (Sweets someSweets : present) {
            System.out.println(someSweets.toString());
            sumWeight += someSweets.getWeight();
            sumPrice += someSweets.getPrice();
        }
        System.out.println("Total weight = " + sumWeight + ", total price = " + sumPrice);
    }


}
