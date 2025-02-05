package Task_14;


import java.util.HashMap;
import java.util.Map;

/**
 * Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
 * арбуз - ягода,
 * банан - трава,
 * вишня - ягода,
 * груша - фрукт,
 * дыня - овощ,
 * ежевика - куст,
 * жень-шень - корень,
 * земляника - ягода,
 * ирис - цветок,
 * картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 *
 * Пример вывода (тут показана только одна строка):
 * картофель - клубень
 * */

public class Task_4 {
    public static void main(String[] args) {

        Map<String, String> items = new HashMap<>();


        items.put("арбуз", "ягода");
        items.put("банан", "трава");
        items.put("вишня", "ягода");
        items.put("груша", "фрукт");
        items.put("дыня", "овощ");
        items.put("ежевика", "куст");
        items.put("жень-шень", "корень");
        items.put("земляника", "ягода");
        items.put("ирис", "цветок");
        items.put("картофель", "клубень");



        for (Map.Entry<String,String> f : items.entrySet()) {
            System.out.println(f.getKey() + " - " + f.getValue());
        }
    }
}
