package Task_9.Task_1;

public class Dog extends Animal{


    public Dog() {
        this.food = "мясо";
        this.location = "двор";
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }

    @Override
    public void eat() {
        System.out.println("собакен ест" + food);
    }
}
