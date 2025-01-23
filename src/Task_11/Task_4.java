package Task_11;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 1.1 Создай метод printList
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран.
 * Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 * */


public class Task_4 {
    public static void main(String[] args) {



        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }

        ArrayList<Integer> b = new ArrayList<>(); //для делящихся на 3
        ArrayList<Integer> c = new ArrayList<>(); //для делящихся на 2
        ArrayList<Integer> d = new ArrayList<>(); //для остального


        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 3 == 0 && arrayList.get(i) % 2 == 0) {
                b.add(arrayList.get(i));
                c.add(arrayList.get(i));
            } else if (arrayList.get(i) % 3 == 0) {
                b.add(arrayList.get(i));
            } else if (arrayList.get(i) % 2 == 0) {
                c.add(arrayList.get(i));
            } else {
                d.add(arrayList.get(i));
            }
        }

       printList(b, c, d);

    }

    public static void printList(ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d) {

        for (Integer num : b) {
            System.out.println(num);
        }
        for (Integer num : c) {
            System.out.println(num);
        }
        for (Integer num : d) {
            System.out.println(num);
        }
    }

}
