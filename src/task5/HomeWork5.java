package task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      1 задание

        System.out.println("Ведите 8 строк текста, цикл поместит их в массив и выведет в обратном порядке.");

        String [] arrayLinesFirstTask = new String[10];

        for (int i = 2; i < arrayLinesFirstTask.length; i++) {

            arrayLinesFirstTask[i] = scanner.nextLine();
        }

        for (int i = 10  - 1; i >= 0; i--) {

            System.out.println(arrayLinesFirstTask[i]);

        }

        System.out.println(" ");

        //_________________________________________________________________
//

 //       2 задание

        System.out.println("Введите 10 чисел для нахождения максимального: ");

        int [] findingTheMaximumNumber = new int[10];

        for (int i = 0; i < findingTheMaximumNumber.length; i++) {

            findingTheMaximumNumber[i] = scanner.nextInt();
        }


        int theMaximumNumberSecondTask = Arrays.stream(findingTheMaximumNumber).max().getAsInt();


        System.out.println(theMaximumNumberSecondTask);

        System.out.println(" ");


        //________________________________________________________________________________________________________


//        // 3 задание

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

        System.out.println(" ");


//  4 задание!

        System.out.println("Введите 10 чисел для массива, цикл выдаст их в обратном порядке.");

        int [] reverseArray = new int[10];

        for (int i = 0; i < reverseArray.length; i++) {

            reverseArray[i] = scanner.nextInt();
        }

        for (int i = 10  - 1; i >= 0; i--) {
            System.out.println(reverseArray[i]);
        }
        System.out.println(" ");

        // 5 задание


//        вот этот франкенштейн работает, но я придумал лучше

//        int [] array = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//
//        for (int i = 0; i < array.length; i++) {
//
//            array [i] = scanner.nextInt();
//        }
//
//        int [] array1 = new int [2];
//
////        int [] array2 = new int [2];
//
//        for (int i = 0; i < 2; i++) {
//
//            array1[i] = array[i];
//
//        }
//
//        int [] array2 = array;
//
//            for (int j = 2; j < 4; j++) {
//
//            array2 [j] = array [j];
//
//            System.out.print(" " + array2[j]);
//        }



//       5 задание


        System.out.println("Введите 20 чисел для массива, цикл вернет последни 10.");

        int [] mainArray = new int[20];

        for (int i = 0; i < mainArray.length; i++) {

            mainArray[i] = scanner.nextInt();
        }

        int [] firstHalfArray = new int [10];

        int [] secondHalfArray = new int [10];

        for (int i = 0; i < 10; i++) {

            firstHalfArray[i] = mainArray[i];

        }

            for (int j = 0; j < 10; j++) {

                secondHalfArray[j] = mainArray[j + 10];

                System.out.print(secondHalfArray[j] + " ");
            }

        System.out.println(" ");


//        6 задание

        System.out.println("Ведите 20 разных чисел, цикл найдет самое большое и самое маленькое число");

        int [] rollerCoasterArray = new int[20];

        for (int i = 0; i < rollerCoasterArray.length; i++) {

            rollerCoasterArray[i] = scanner.nextInt();
        }

        int maxArrayIndex = Arrays.stream(rollerCoasterArray).max().getAsInt();

        int minArrayIndex = Arrays.stream(rollerCoasterArray).min().getAsInt();

        System.out.println("Максимальное значение - число " + maxArrayIndex + "; " + "Минимальное значение - число " + minArrayIndex + ".");

        System.out.println(" ");

//
//        // 7 задание


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
