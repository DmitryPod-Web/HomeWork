package Task7;


//Написать метод, который будет принимать число и степень.
// В этом методе нужно два раза вызвать ДРУГОЙ МЕТОД,
// который вернет число в заданной степени.
// А затем сложить результаты двух вызовов и вывести в консоль.


import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int exponent = scanner.nextInt();

        int numberRaised1 = fiestMetod (number, exponent);

        int numberRaised2 = sekondMetod (number, exponent);

        int sum = numberRaised1 + numberRaised2;

        System.out.println(sum);
    }

    public static int fiestMetod (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static int sekondMetod (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }





}
