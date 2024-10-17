package task5;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите 20 разных чисел, цикл найдет самое большое и самое маленькое число");

        int [] rollerCoasterArray = new int[20];

        for (int i = 0; i < rollerCoasterArray.length; i++) {

            rollerCoasterArray[i] = scanner.nextInt();
        }

        int maxArrayIndex = Arrays.stream(rollerCoasterArray).max().getAsInt();

        int minArrayIndex = Arrays.stream(rollerCoasterArray).min().getAsInt();

        System.out.println("Максимальное значение - число " + maxArrayIndex + "; " + "Минимальное значение - число " + minArrayIndex + ".");


    }
}
