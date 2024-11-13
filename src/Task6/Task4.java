package Task6;

//1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
//        которой совпадает с текущим индексом из массива чисел.



import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите 10 строк и цикл найдет длину каждой строки.");

        String [] numberOfString = new String [10];

        int [] numberArray = new int [10];

        for (int i = 0; i < numberOfString.length; i++) {

            numberOfString[i] = scanner.nextLine();
            numberArray[i] = numberOfString[i].length();
        }



        for (int i = 0; i < numberArray.length; i++) {
            int string = i + 1;
            int stringLength = numberArray[i];
            String result = String.format("Строка номер %d имеет: %d символов", string, stringLength);
            System.out.println(result);

        }


    }
}
