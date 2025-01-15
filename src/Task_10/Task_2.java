package Task_10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 * */

public class Task_2 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

//        strings.add(scanner.nextLine());
//        strings.add(scanner.nextLine());
//        strings.add(scanner.nextLine());
//        strings.add(scanner.nextLine());
//        strings.add(scanner.nextLine());

//        или

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        scanner.close();

        int maxLength = 0;
        ArrayList<String> longestStrings = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.length() == maxLength) {
                longestStrings.add(str);
            }
        }

        for (int i = 0; i < longestStrings.size(); i++) {
            System.out.println(longestStrings.get(i));
        }

    }
}
