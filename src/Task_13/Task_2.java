package Task_13;


/**
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {


        List<String> strings = List.of("мама", "мыла", "раму");

        List<String> resultStrings = new ArrayList<>();

        for (String p : strings) {
            resultStrings.add(p);
            resultStrings.add("именно");
        }

        System.out.println(resultStrings);
    }
}
