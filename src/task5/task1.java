package task5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите 8 строк текста, цикл поместит их в массив и выведет в обратном порядке.");

        String [] strings = new String[10];

        for (int i = 2; i < strings.length; i++) {

            strings[i] = scanner.nextLine();
        }

        for (int i = 10  - 1; i >= 0; i--) {

            System.out.println(strings[i]);

        }
    }

}
