package Task6;



//1. Считать 6 строк и заполнить ими массив strings.
//        2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] strings = new String [6];

        for (int i = 0; i < 6; i++) {
            strings[i]= scanner.nextLine();
        }


        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])){
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }


    }
}
