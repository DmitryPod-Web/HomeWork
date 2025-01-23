package Task7;

public class task1 {
 // Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.


    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = cube(number);
        System.out.println("Число " + number + " в кубе: " + result);
    }
}

