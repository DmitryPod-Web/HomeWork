package Task_9.Task_2_1;

public class Main {
    public static void main(String[] args) {

        Goods potato = new Goods("Картофель", 50, 4);
        Goods carrot = new Goods("Морковь", 30, 5);
        Goods apple = new Goods("Яблоки", 60, 4);
        Goods banana = new Goods("Бананы", 80, 4);
        Goods chicken = new Goods("Курица", 200, 5);
        Goods beef = new Goods("Говядина", 300, 4);

        Goods[] vegetables = {potato, carrot};
        Goods[] fruits = {apple, banana};
        Goods[] meats = {chicken, beef};


        Category categoryVegetables = new Category("Овощи", vegetables);
        Category categoryFruits = new Category("Фрукты", fruits);
        Category categoryMeats = new Category("Мясо", meats);


        Basket basket = new Basket(10);

        User user = new User("john_doe", "password123", basket);

        basket.addProduct(potato);
        basket.addProduct(apple);
        basket.addProduct(chicken);

        basket.showBasket();

        if (user.authenticate("john_doe", "password123")) {
            System.out.println("Пользователь аутентифицирован.");
        } else {
            System.out.println("Неверный логин или пароль!");
        }
    }
}
