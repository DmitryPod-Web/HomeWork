package Task_10;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 * */

public class Task_3 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        scanner.close();

        int minLength = strings.getFirst().length();


        ArrayList<String> longestStrings = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.length() == minLength) {
                longestStrings.add(str);
            }
        }

        for (int i = 0; i < longestStrings.size(); i++) {
            System.out.println(longestStrings.get(i));
        }
    }
}



