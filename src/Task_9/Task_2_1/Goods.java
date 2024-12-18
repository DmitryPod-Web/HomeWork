package Task_9.Task_2_1;

public class Goods {

    String name;
    int price;
    int rating;

    public Goods(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (Цена: " +
                price + "руб., Рейтинг: " +
                rating + ")";
    }
}
