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

  //    int numberRaised1 = firstMethod (number, exponent);

 //    int numberRaised2 = seсondMetod (number, exponent);

        int sum = getSum(number, exponent);

        System.out.println(sum);
    }


    public static int power(int a, int b){
        return (int) Math.pow(a, b);
    }

    public static int getSum(int number, int exponent) {
    return power(number, exponent) + power(number, exponent);
    }



//    public static int firstMethod (int a, int b){
//        int result = 1;
//        for (int i = 0; i < b; i++) {
//            result *= a;
//        }
//        return result;
//    }
//
//    public static int seсondMetod(int a, int b){
//        int result = 1;
//        for (int i = 0; i < b; i++) {
//            result *= a;
//        }
//        return result;
//    }





}
