package Task_8;

import Task_8.Humanity.*;

public class Mane {



    public static void main(String[] args) {

        Children_1 children_1 = new Children_1("Дима",true, 15, "Михаил", "Марина");

        Children_2 children_2 = new Children_2("Даниил", true, 12, "Михаил", "Марина");

        Children_3 children_3 = new Children_3("Лера", false, 16, "Михаил", "Марина");

        Father_1 father_1 = new Father_1("Михаил", true, 43, "Александр", "Вера");

        Mather_1 mather_1 = new Mather_1("Марина", false, 40, "Святослав", "Рада");

        Grand_Father_1 grand_father_1 = new Grand_Father_1("Александр", true, 78);

        Grand_Father_2 grand_father_2 = new Grand_Father_2("Святослав", true, 75);

        Grand_Mather_1 grand_mather_1 = new Grand_Mather_1("Вера", false, 75);

        Grand_Mather_2 grand_mather_2 = new Grand_Mather_2("Рада", false, 69);


        Human [] family = new Human[9];

        family[0] = children_1;
        family[1] = children_2;
        family[2] = children_3;
        family[3] = father_1;
        family[4] = mather_1;
        family[5] = grand_father_1;
        family[6] = grand_father_2;
        family[7] = grand_mather_1;
        family[8] = grand_mather_2;

        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i].toString());
        }

    }
}
