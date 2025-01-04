package Task_9.Task_1;

public class Horse extends Animal{

    public Horse() {
        this.food = "сено";
        this.location = "стойло";
    }

    @Override
    public void makeNoise() {
        System.out.println("фыр");
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест" + food);
    }
}
