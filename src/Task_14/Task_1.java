package Task_14;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 * 4. Вывести содержимое Map на экран.
 * */


public class Task_1 {
    public static void main(String[] args) {

        Map<String, String> family = new HashMap<>();

        family.put("Иванов", "Алексей");
        family.put("Петров", "Сергей");
        family.put("Сидоров", "Алексей");
        family.put("Иванов", "Дмитрий");
        family.put("Кузнецов", "Иван");
        family.put("Петров", "Анатолий");
        family.put("Смирнов", "Дмитрий");
        family.put("Кузнецов", "Константин");
        family.put("Сидоров", "Константин");
        family.put("Морозов", "Евгений");

       for (Map.Entry<String, String> entry : family.entrySet()) {
           System.out.println(entry.getKey() + " - " + entry.getKey());
       }

    }
}
