package Task_9.Task_2_1;

public class Basket {

    Product[] boughtProducts;
    private int totalCount;

    public Basket(int size) {
        this.boughtProducts = new Product[size];
        this.totalCount = 0;
    }

    public void addProduct(Product product) {
        if (totalCount < boughtProducts.length) {
            boughtProducts[totalCount] = product;
            totalCount++;
        } else {
            System.out.println("Полная корзина");
        }
    }

    public void showBasket() {
        System.out.println("Продукты в корзине: ");
        for (int i = 0; i < totalCount; i++) {
            System.out.println(boughtProducts[i]);
        }
    }

}