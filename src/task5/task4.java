package task5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 чисел для массива, цикл выдаст их в обратном порядке.");

        int [] reverseArray = new int[10];

        for (int i = 0; i < reverseArray.length; i++) {

            reverseArray[i] = scanner.nextInt();
        }

        for (int i = 10  - 1; i >= 0; i--) {
            System.out.println(reverseArray[i]);
        }

    }
}
