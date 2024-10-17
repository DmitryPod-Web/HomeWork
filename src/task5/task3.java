package task5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите 10 строк и цикл найдет длину каждой строки.");

        String [] stringArray = new String [10];

        int [] numberArray = new int [10];

        for (int i = 0; i < stringArray.length; i++) {

            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < numberArray.length; i++) {

            numberArray[i] = stringArray[i].length();
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Строка номер " + (i + 1) + " имеет: " + numberArray[i] + " символов.");

        }

    }
}
