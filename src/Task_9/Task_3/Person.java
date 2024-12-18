package Task_9.Task_3;

import Task_8.Human;

public class Person {

    String fullName;
    int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("Этот " + fullName + " говорит.");
    }

    public  void move() {
        System.out.println("Этот " + fullName + " человек идет.");
    }


    @Override
    public String toString() {
        return "Имя: " +
                fullName +
                " возрастом: " +
                age;
    }

    public static void main(String[] args) {

    Person human1 = new Person("Алексей", 24);
    Person human2 = new Person();

        System.out.println(human1);
        System.out.println(human2);

        human1.talk();
        human1.move();

        human2.talk();
        human2.move();
    }

}
