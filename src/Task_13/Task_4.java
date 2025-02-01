package Task_13;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 * */

public class Task_4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<String> strings = new ArrayList<>();



        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }

        scanner.close();

       List<String> doubleList = doubleValues(strings);
       doubleList.forEach(System.out::println);
    }


    public static List<String> doubleValues(List<String> dubl) {
        return dubl.stream().flatMap(p -> Stream.of(p, p))
                .toList();
    }

}


