package Задание3;

import java.util.Scanner;

public class threesix {
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

        threesix program = new threesix();
        boolean res = program.equalNum(x);
        System.out.println(res);
    }

    public boolean equalNum(int x) {
        int first = x / 10;
        int last = x % 10;
        while (first > 1) {

                int last_of_first = first % 10;
                if (last_of_first != last) {
                    return false;
                }
                else {
                    first=first/10;
                }
        }
        return true;
    }
}