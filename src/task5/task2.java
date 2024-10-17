package task5;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 чисел для нахождения максимального: ");

        int [] findingTheMaximumNumber = new int[10];

        for (int i = 0; i < findingTheMaximumNumber.length; i++) {

            findingTheMaximumNumber[i] = scanner.nextInt();
        }


        int theMaximumNumberSecondTask = Arrays.stream(findingTheMaximumNumber).max().getAsInt();


        System.out.println(theMaximumNumberSecondTask);

    }
}
