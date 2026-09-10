package Задание2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        task2 program = new task2();
        int res2_1 = program.abs(0);
        System.out.println(res2_1);
        String res2_4 = program.makeDecision(0,0);
        System.out.println(res2_4);
        int res2_5 = program.max3(0,0,0);
        System.out.println(res2_5);
        int res2_7 = program.sum2(0,0);
        System.out.println(res2_7);
        String res2_9 = program.day(0);
        System.out.println(res2_9);
    }

    public int abs (int x) { //задача 1
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
        if (x1<0) {
            return -x1;
        }
        else {
            return x1;
        }
    }
    public String makeDecision (int x, int y) { //задача 2 (4 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        if (x1 > y1) {
            return (x1 +">"+ y1);
        }
        else if (x1 < y1) {
            return (x1 +"<"+ y1);
        }
        else {
            return (x1 +"=="+ y1);
        }
    }
    public int max3 (int x, int y, int z) { //задача 3 (5 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;
        int z1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите третье целое число:");
            if (scanner.hasNextInt()) {
                z1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if (x1 > y1) {
            y1 = x1;
        }
        else {
            x1 = y1;
        }
        if (z1 > x1){
            return z1;
        }
        else {
            return x1;
        }
    }
    public int sum2 (int x, int y) { //задача 4 (7 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if ((x1 + y1)<10 || (x1 + y1)>19) {
            return (x1 + y1);
        }
        else {
            return 20;
        }
    }
    public String day (int x) { //задача 5 (9 в лаб)
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
        switch (x1) {
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
