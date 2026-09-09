package Задание1;

import java.util.Scanner;

public class oneeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        oneeight program = new oneeight();
        boolean res=program.isDivisor(2,33);
        System.out.println(res);

    }
    public boolean isDivisor (int a, int b) {
        if ((a%b)==0 || (b%a)==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
