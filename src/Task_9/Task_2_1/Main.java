package Task_9.Task_2_1;

public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Картофель", 50, 4);
        Product carrot = new Product("Морковь", 30, 5);
        Product apple = new Product("Яблоки", 60, 4);
        Product banana = new Product("Бананы", 80, 4);
        Product chicken = new Product("Курица", 200, 5);
        Product beef = new Product("Говядина", 300, 4);

        Product[] vegetables = {potato, carrot};
        Product[] fruits = {apple, banana};
        Product[] meats = {chicken, beef};


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
