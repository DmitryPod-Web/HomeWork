package task5;

import java.util.Random;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];


        Random randomArray = new Random ();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomArray.nextInt(100);
        }

        for (int i = 10  - 1; i >= 0; i--) {

            System.out.println(numbers[i]);

        }

    }
}
