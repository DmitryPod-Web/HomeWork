package Task_9.Task_2_1;

public class Category {

    String nameOfCategory;
    Goods[] goods;

    public Category(String nameOfCategory, Goods[] goods) {
        this.nameOfCategory = nameOfCategory;
        this.goods = goods;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
}
