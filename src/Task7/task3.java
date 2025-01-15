package Task7;



//Необходимо написать метод, который бы возвращал из 2 чисел меньшее число
//Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int min = minNumber (firstNumber, secondNumber);

        System.out.println(min);
    }

    public static int minNumber(int a, int b){
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}