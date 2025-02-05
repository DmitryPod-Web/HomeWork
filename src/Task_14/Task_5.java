package Task_14;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 *
 * Пример вывода (тут показана только одна строка):
 * Sim - 5
 *
 * */


public class Task_5 {

    public static void main(String[] args) {

        Map<String, Object> dataMap = new HashMap<>();

        dataMap.put("first", "Hello, World!");
        dataMap.put("second", 42);
        dataMap.put("third", "Java");
        dataMap.put("fourth", 3.14);
        dataMap.put("fifth", "Map Example");
        dataMap.put("sixth", 7.89);
        dataMap.put("seventh", "Deep");
        dataMap.put("eighth", 123);
        dataMap.put("ninth", "China");
        dataMap.put("tenth", 1000000);


        for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
