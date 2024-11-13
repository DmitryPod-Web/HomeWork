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

        for (int i = 1; i < 5; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }
        }


            String formatLonger = String.format("Самая длинная строка: \"%s\" ее длинна: %d", longest, longest.length());
            String formatSortest = String.format("Самая короткая строка: \"%s\" ее длинна: %d", shortest, shortest.length());

            System.out.println(formatLonger);
            System.out.println(formatSortest);

    }
}
