package Task_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 * 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 * */


public class Task_5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<String> strings = new ArrayList<>();



        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }



        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).length() > strings.get(i + 1).length()) {
                System.out.println("Порядок нарушен. Индекс: " + (i + 1));
                return;
            }
        }

        System.out.println("Список упорядочен по возрастанию");

    }
}
