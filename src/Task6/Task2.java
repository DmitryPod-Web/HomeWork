package Task6;

//Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.



import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (int i = 0; i < 5; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }
        }


            System.out.println("Самая короткая строка: " + shortest.length());
            System.out.println("Самая длинная строка: " + longest.length());

    }
}
