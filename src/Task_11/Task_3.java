package Task_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 10 строчек с клавиатуры.
 * 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 * */


public class Task_3 {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }

        scanner.close();

        int indexMin = 0;

        int indexMax = 0;


        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < arrayList.get(indexMin).length()) {
                indexMin = i;
            } else if (arrayList.get(i).length() > arrayList.get(indexMax).length()) {
                indexMax = i;
            }
        }




        int firstStr;

        if (indexMax < indexMin) {
            firstStr = indexMax;
        } else {
            firstStr = indexMin;
        }

        System.out.println(arrayList.get(firstStr));
    }
}
