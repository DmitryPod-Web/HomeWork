package Task7;

//Условие задачи:
//Необходимо написать простой консольный калькулятор на Java.
//
//
//
//Метод int getInt() - должен считывать с консоли целое число и возвращать его
//Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
//Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
//Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

import java.util.Scanner;

public class task5 {


    // считывает число и возвращает его
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // считывает математический оператор
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    // выполняет арифметическую операцию
    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0;
                }

            case '*':
                return num1 * num2;

            default:
                System.out.println("Ошибка ввода.");
                return 0;
        }

    }
// подсчет и вывод
    public static void main(String[] args) {

        System.out.println("Введите первое число");
        int num1 = getInt();

        System.out.println("Введите оператор (+, -, /, *)");
        char operation = getOperation();

        System.out.println("Введите второе число");
        int num2 = getInt();


        int result = calc(num1, num2, operation);
        System.out.println("Ответ:");
        System.out.println(result);


    }


}
