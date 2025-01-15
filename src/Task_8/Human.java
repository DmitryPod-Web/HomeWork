package Task_8;

public class Human {

    //fields

    private String name;
    private boolean isMale;
    private int age;
    private Human father;
    private Human mather;

    //constructor


    public Human(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.father = null;
        this.mather = null;
    }

    public Human(String name, boolean isMale, int age, Human father, Human mather) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }

    @Override
    public String toString() {
        String result = "Имя: " + name  +
                ", пол: " + getIsMale() +
                ", возраст: " + age;
        if (father != null) {
            result += ", отец: " + father.getName();
        }
        if (mather != null) {
            result += ", мать: " + mather.getName();
        }
        return result;
    }



    //method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsMale() {
        return isMale ? "мужской" : "женский";
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMather() {
        return mather;
    }

    public void setMather(Human mather) {
        this.mather = mather;
    }
}
