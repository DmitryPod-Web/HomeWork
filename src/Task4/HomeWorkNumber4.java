package Task4;

import java.util.Scanner;

public class HomeWorkNumber4 {
    public static void main(String[] args) {


//        1
//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//
//        Пример: m=2, n=4
//        8888
//        8888
//
//        System.out.println("Введите высоту треугольника и длину треугольника:");


        System.out.println("Введите высоту и длину прямоугольника: ");
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();  // высота
        int n = scanner.nextInt();  // длинна


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
                }

            System.out.println();
        }


//        2
//        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//
//        Пример вывода на экран:
//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888

        System.out.println("Рисуем равнобедренный треугольник высотой 10 строк:");

        int TheLengthOfTheTriangle = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= TheLengthOfTheTriangle; j++) {

                System.out.print("8");
            }
            TheLengthOfTheTriangle++;
            System.out.println();
        }


//        3
//
//
//        Ввести с клавиатуры три числа, вывести на экран среднее из них.
//                Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.
//


        System.out.println("Выбираем среднее по значению число:");

        int firstNumber = 125;
        int secondNumber = 45124;
        int thiedNumber = -15;

        int minNumber = Math.min(firstNumber, Math.min(secondNumber,thiedNumber));
        int maxNumber = Math.max(firstNumber, Math.max(secondNumber,thiedNumber));
        System.out.println(firstNumber + secondNumber + thiedNumber - minNumber - maxNumber);

//        4
//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//                -1 должно учитываться в сумме.

        System.out.println("Вводите числа для их сложения, число -1 остановит программу");

        int inputNumber;
        int countNumber = 0;

        while (true) {
            inputNumber = scanner.nextInt();
            if (inputNumber != -1) {
                countNumber += inputNumber;
            } else {
                System.out.println(countNumber + inputNumber);
                break;
            }
        }


        // 5 задание

        System.out.println("Цикл выводит таблицу умножения 10х10:");
        int a = 1;

        while (a < 2) {

            for (int i = 1; i < 11; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.print(j * i + " ");
                    a++;
                }
                System.out.println("");
            }


        }

 //        6 задание

        Scanner scannerForTheTaskSix = new Scanner(System.in);

        System.out.println("Введите имя:");

        String name = scannerForTheTaskSix.nextLine();

        System.out.println("Введите день рождения:");
        int birthdayDay = scannerForTheTaskSix.nextInt();
        System.out.println("Введите месяц рождения:");
        int birthdayMonth = scannerForTheTaskSix.nextInt();
        System.out.println("Введите год рождения:");
        int birthdayYear = scannerForTheTaskSix.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + birthdayDay + "." + birthdayMonth + "." + birthdayYear + ".");




    }
}