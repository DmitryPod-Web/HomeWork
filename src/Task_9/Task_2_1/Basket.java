package Task_9.Task_2_1;

public class Basket {

    Goods[] boughtGoods;
    int totalCount;

    public Basket(int size) {
        this.boughtGoods = new Goods[size];
        this.totalCount = 0;
    }

    public void addProduct(Goods product) {
        if (totalCount < boughtGoods.length) {
            boughtGoods[totalCount] = product;
            totalCount++;
        } else {
            System.out.println("Полная корзина");
        }
    }

    public void showBasket() {
        System.out.println("Продукты в корзине: ");
        for (int i = 0; i < totalCount; i++) {
            System.out.println(boughtGoods[i]);
        }
    }

}