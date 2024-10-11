import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;
//        int c = 5;
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println(min);




//        int b = 1;
//
//        while (b < 2) {
//
//            for (int i = 1; i < 11; i++) {
//                for (int j = 1; j < 11; j++) {
//                    System.out.print(j * i + " ");
//                    b++;
//                }
//                System.out.println("");
//            }
//        }

        Scanner scanner = new Scanner(System.in);

//        int d;
//        int c = 0;
//
//        while (true) {
//            d = scanner.nextInt();
//            if (d != -1) {
//                c += d;
//            } else {
//                System.out.println(c + d);
//                break;
//            }
//        }



        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите день рождения:");
        int d = scanner.nextInt();
        System.out.println("Введите месяц рождения:");
        int m = scanner.nextInt();
        System.out.println("Введите год рождения:");
        int y = scanner.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y + ".");

    }
}
