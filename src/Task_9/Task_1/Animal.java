package Task_9.Task_1;

public class Animal {

    protected String food;
    protected String location;


    public void makeNoise() {
        System.out.println(this);
    }

    public void eat() {
        System.out.println(this);
    }

    public void sleep() {
        System.out.println(this);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
