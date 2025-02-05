package Task_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




/**
 *
 *Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
 * Используй коллекции.
 * */
public class Task_2 {
    public static void main(String[] args) {

        Map<String, Integer> monthMap = new HashMap<>();

        monthMap.put("Январь", 1);
        monthMap.put("Февраль", 2);
        monthMap.put("Март", 3);
        monthMap.put("Апрель", 4);
        monthMap.put("Май", 5);
        monthMap.put("Июнь", 6);
        monthMap.put("Июль", 7);
        monthMap.put("Август", 8);
        monthMap.put("Сентябрь", 9);
        monthMap.put("Октябрь", 10);
        monthMap.put("Ноябрь", 11);
        monthMap.put("Декабрь", 12);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String month = scanner.nextLine();

        if (monthMap.containsKey(month)) {
            System.out.println(month + " это: " + monthMap.get(month) + " месяц");
        } else {
            System.out.println("Неправильно введено название месяца.");
        }
    }
}
