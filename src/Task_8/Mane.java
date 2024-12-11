package Task_8;

public class Mane {



    public static void main(String[] args) {

        Human grandFather1 = new Human("Александр", true, 78);
        Human grandFather2 = new Human("Святослав", true, 75);
        Human grandMather1 = new Human("Вера", false, 75);
        Human grandMather2 = new Human("Рада", false, 69);

        Human father1 = new Human("Михаил", true, 43, grandFather1, grandMather1);
        Human mather1 = new Human("Марина", false, 40, grandFather2, grandMather2);

        Human children1 = new Human("Дима", true, 15, father1, mather1);
        Human children2 = new Human("Даниил", true, 12, father1, mather1);
        Human children3 = new Human("Лера", false, 16, father1, mather1);


        Human[] family = {grandFather1, grandFather2, grandMather1, grandMather2, father1, mather1, children1, children2, children3};


        for (Human person : family) {
            System.out.println(person.toString());
        }
    }
}
