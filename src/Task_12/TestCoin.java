package Task_12;

import java.util.HashSet;
import java.util.TreeSet;

public class TestCoin {
    public static void main(String[] args) {

        Coin coin1 = new Coin(1, 100, "UK", 1.2);
        Coin coin2 = new Coin(100, 100, "Russian", 1.7);
        Coin coin3 = new Coin(100, 460, "Australia",2.4);
        Coin coin4 = new Coin(32, 3200, "Australia", 1.4);
        Coin coin5 = new Coin(32, 3200, "Australia", 1.3);


        TreeSet<Coin> coins = new TreeSet<>(new ComparatorCoin());

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }



}
