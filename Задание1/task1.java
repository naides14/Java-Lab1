package Задание1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        task1 program = new task1();
        int res_1_3 = program.charToNum('5');
        System.out.println(res_1_3);
        boolean res1_4 = program.isPositive(-5);
        System.out.println(res1_4);
        boolean res1_6 = program.isUpperCase('K');
        System.out.println(res1_6);
        boolean res1_8 = program.isDivisor(2, 33);
        System.out.println(res1_8);
        int res1_10=program.lastNumSum(0,0);
        System.out.println(res1_10);
    }

    public int charToNum(char x) { //задача 1 (3 в лабораторной)
        return Character.getNumericValue(x);
    } //задача 1 (3 в лабораторной

    public boolean isPositive(int x) { //задача 2 (4 в лабораторной)

        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if (x1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUpperCase(char x) { //задача 3 (6 в лабораторной)
        if (Character.isUpperCase(x)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisor(int a, int b) { //задача 4 (8 в лабораторной)
        Scanner scanner = new Scanner(System.in);
        int a1;
        int b1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                a1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                b1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if ((a1 % b1) == 0 || (b1 % a1) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int forlastNumSum(int a, int b) {
        return ((a % 10) + (b % 10));
    } //для след метода
    public int lastNumSum(int a, int b) { //задача 5 (10 в лабораторной)
        Scanner scanner = new Scanner(System.in);
        int a1;
        int b1;


        while (true) {
            System.out.println("Введите начальное число:");
            if (scanner.hasNextInt()) {
                a1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        System.out.println("Начальное число: "+ a1);
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.println("Введите следующее число:");
                if (scanner.hasNextInt()) {
                    b1 = scanner.nextInt();
                    break;
                }
                System.out.println("Введено не целое число!");
                scanner.next();
            }

            b1 = forlastNumSum(a1, b1);
            System.out.println(b1);
            a1 = b1;
        }
        return a1;
    }


}


