package Task6;


//Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//
//Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит слова на экран.


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());


        if (input.length() % 2 == 0){
            System.out.println(input + input);
        } else {
            System.out.println(input + input + input);
        }



    }


}

