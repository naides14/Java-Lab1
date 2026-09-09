package Задание2;

import java.util.Scanner;

public class twoone {
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

        twoone program = new twoone();
        int res = program.abs(x);
        System.out.println(res);
    }

    public int abs (int x) {
        if (x<0) {
            return -x;
        }
        else {
            return x;
        }
    }
}
