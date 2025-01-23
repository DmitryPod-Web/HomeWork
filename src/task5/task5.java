package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 20 чисел для массива, цикл вернет последни 10.");

        int [] mainArray = new int[20];

        for (int i = 0; i < mainArray.length; i++) {

            mainArray[i] = scanner.nextInt();
        }

        int [] firstHalfArray = new int [10];

        int [] secondHalfArray = new int [10];

        for (int i = 0; i < 10; i++) {

            firstHalfArray[i] = mainArray[i];
            secondHalfArray[i] = mainArray[i + 10];
            System.out.print(secondHalfArray[i] + " ");
        }

//        for (int j = 0; j < 10; j++) {
//
//            secondHalfArray[j] = mainArray[j + 10];
//
//            System.out.print(secondHalfArray[j] + " ");
//        }


    }
}
