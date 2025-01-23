package Task_11;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 * */


public class Task_2 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String lastStr = arrayList.getLast();
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, lastStr);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
