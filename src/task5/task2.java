package task5;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 чисел для нахождения максимального: ");

        int [] findMaxNumber = new int[10];

        for (int i = 0; i < findMaxNumber.length; i++) {

            findMaxNumber[i] = scanner.nextInt();
        }


        int maxNumberTask = Arrays.stream(findMaxNumber)
                .max()
                .getAsInt();


        System.out.println(maxNumberTask);

    }
}
