package Задание2;

import java.util.Scanner;

public class twoseven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        twoseven program = new twoseven();
        int res = program.sum2(x,y);
        System.out.println(res);
    }

    public int sum2 (int x, int y) {
        if ((x+y)<10 || (x+y)>19) {
            return (x+y);
        }
        else {
            return 20;
        }
    }
}