package Task_11;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 * */

public class Task_1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(0, scanner.nextLine());
        }

        scanner.close();

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
