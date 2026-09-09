package Задание1;

import java.util.Scanner;

public class oneten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        oneten program = new oneten();

        while (true) {
            System.out.println("Введите начальное число:");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        System.out.println("Начальное число: "+a);
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.println("Введите следующее число:");
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    break;
                }
                System.out.println("Введено не целое число!");
                scanner.next();
            }

            b = program.lastNumSum(a, b);
            System.out.println(b);
            a=b;
        }
    }

    public int lastNumSum(int a, int b) {
        return ((a%10)+(b%10));
    }
}