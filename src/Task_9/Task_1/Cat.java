package Task_9.Task_1;

public class Cat extends Animal{


    public Cat() {
        this.food = "рыба";
        this.location = "дом";
    }


    @Override
    public void makeNoise() {
        System.out.println("мяу");
    }

    @Override
    public void eat() {
        System.out.println("кошка ест" + food);
    }
}
