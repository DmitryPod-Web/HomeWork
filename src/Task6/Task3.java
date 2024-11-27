package Task6;

//1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
//


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 8 строк для массива, цикл выдаст их в обратном порядке.");

        String [] strings = new String[10];

        for (int i = 2; i < strings.length; i++) {

            strings[i] = scanner.nextLine();
        }

        for (int i = 10  - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }

    }
}
