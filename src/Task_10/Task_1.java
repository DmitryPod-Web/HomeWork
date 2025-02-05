package Task_10;


import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строк.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 * */

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        strings.add("Четыре");
        strings.add("Пять");

        System.out.println(strings.size());

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
