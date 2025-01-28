package task5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите 20 разных чисел, цикл найдет самое большое и самое маленькое число");

        int [] MinMaxMeaning = new int[20];

        for (int i = 0; i < MinMaxMeaning.length; i++) {

            MinMaxMeaning[i] = scanner.nextInt();
        }

        IntSummaryStatistics stats = Arrays.stream(MinMaxMeaning)
                .collect(IntSummaryStatistics::new,
                        IntSummaryStatistics::accept,
                        IntSummaryStatistics::combine);


        int max = stats.getMax();
        int min = stats.getMin();

        String result = String.format("максимальное значение: %d %nминимальное значение: %d",max, min);

        System.out.println(result);

//        int maxArrayIndex = Arrays.stream(rollerCoasterArray).max().getAsInt();
//
//        int minArrayIndex = Arrays.stream(rollerCoasterArray).min().getAsInt();

//        System.out.println("Максимальное значение - число " + maxArrayIndex + "; " + "Минимальное значение - число " + minArrayIndex + ".");


    }
}
