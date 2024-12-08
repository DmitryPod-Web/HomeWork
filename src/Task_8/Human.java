package Task_8;

public class Human {

    //fields

    private String name;
    private Boolean sex;
    private int age;
    private String father;
    private String mather;

    //constructor


    public Human(String name, Boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, Boolean sex, int age, String father, String mather) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }

    @Override
    public String toString() {
        return "Имя: " + name  +
                ", пол: " + sex +
                ", возраст: " + age +
                ", отец: " + father +
                ", мать: " + mather;
    }



    //method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex ? "мужской" : "женсикй";
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMather() {
        return mather;
    }

    public void setMather(String mather) {
        this.mather = mather;
    }

}
