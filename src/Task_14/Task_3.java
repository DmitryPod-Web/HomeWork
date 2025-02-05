package Task_14;


import java.util.HashMap;
import java.util.Map;

/**
 * задача: Программа должна работать не с номерами домов, а с городами:
 *
 * Лондон
 *
 * Пример вывода:
 * Абрамовичи
 * */
public class Task_3 {
    public static void main(String[] args) {
        Map<String,String> cityName = new HashMap<>();


        cityName.put("Москва", "Иванов");
        cityName.put("Санкт-Петербург", "Петров");
        cityName.put("Новосибирск", "Сидоров");
        cityName.put("Екатеринбург", "Кузнецов");
        cityName.put("Нижний Новгород", "Морозов");
        cityName.put("Казань", "Васильев");
        cityName.put("Челябинск", "Федоров");
        cityName.put("Самара", "Романов");
        cityName.put("Ростов-на-Дону", "Тимофеев");
        cityName.put("Уфа", "Смирнов");


        System.out.println(cityName.get("Уфа"));


    }
}
