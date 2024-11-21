package Task7;

//Напишите метод, который бы возвращал в консоль:
//
//
//        true, если число больше 5
//        и false, если число меньше 5

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
          checkNumber(number);
          scanner.close();
    }

    public static void checkNumber(int number) {
        if (number > 5){
            System.out.println(true);
        } else if (number == 5) {
            System.out.println("число равно 5");
        } else {
            System.out.println(false);
        }
    }
}
