package task5;

import com.sun.jdi.StringReference;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите 10 строк и цикл найдет длину каждой строки.");

        String [] strings = new String [10];

        int [] numberArray = new int [10];

        for (int i = 0; i < strings.length; i++) {

            strings[i] = scanner.nextLine();
            numberArray[i] = strings[i].length();
        }



        for (int i = 0; i < numberArray.length; i++) {
//            System.out.println("Строка номер " + (i + 1) + " имеет: " + numberArray[i] + " символов.");
            int string = i + 1;
            int symbol = numberArray[i];
            String result = String.format("Строка номер %d имеет: %d символов", string, symbol);
            System.out.println(result);

        }

//        System.out.printf("Строка номер %d + 1 имеет: %d символов.", [i], numberArray[i]);
//        System.out.println("Строка номер " + (i + 1) + " имеет: " + numberArray[i] + " символов.");

    }
}
