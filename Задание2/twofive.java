package Задание2;

import java.util.Scanner;

public class twofive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;

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
        while (true) {
            System.out.println("Введите третье целое число:");
            if (scanner.hasNextInt()) {
                z = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        twofive program = new twofive();
        int res = program.max3(x,y,z);
        System.out.println(res);
    }

    public int max3 (int x, int y, int z) {
        if (x>y) {
            y=x;
        }
        else {
            x=y;
        }
        if (z>x){
            return z;
        }
        else {
            return x;
        }
    }
}