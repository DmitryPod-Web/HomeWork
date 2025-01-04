package Task_9.Task_2_1;

public class Category {

    private String nameOfCategory;
    private Product[] products;

    public Category(String nameOfCategory, Product[] products) {
        this.nameOfCategory = nameOfCategory;
        this.products = products;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public Product[] getGoods() {
        return products;
    }

    public void setGoods(Product[] products) {
        this.products = products;
    }
}
