package Task_13;


/**
 * Введи с клавиатуры 5 слов в список строк.
 * Удали 3 - ий элемент списка,
 * и выведи оставшиеся элементы в обратном порядке.
 * */


import java.util.*;

public class Task_1 {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        scanner.close();

        strings.remove(2);

        Collections.reverse(strings);

        System.out.println(strings);
    }
}
