package Задание2;

import java.util.Scanner;

public class twonine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        twonine program = new twonine();
        String res = program.day(x);
        System.out.println(res);
    }

    public String day (int x) {
        switch (x) {
            case (1):
                return "понедельник";
            case (2):
                return "вторник";
            case (3):
                return "среда";
            case (4):
                return "четверг";
            case (5):
                return "пятница";
            case (6):
                return "суббота";
            case (7):
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
}