package Task_13;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 * */


public class Task_3 {
    public static void main(String[] args) {


        List<String> notFixWord = List.of("Кто","контролирует","прошлое"
                ,"тот","контролирует","будущее."
                ,"Большой","брат","следит","за","тобой.");

        List<String> fixList = fix(notFixWord);
        System.out.println(fixList);


    }

    public static List<String> fix(List<String> words) {
        return words.stream()
                .flatMap(word -> {

            if (word.contains("л") && !word.contains("р")) {
                return Stream.of(word, word);
            } else if (word.contains("р") && !word.contains("л")) {
                return Stream.empty();
            } else {
                return Stream.of(word);
            }
        })
                .toList();


    }
}
