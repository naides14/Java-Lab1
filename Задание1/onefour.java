package Задание1;

import java.util.Scanner;

public class onefour {
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

        onefour program = new onefour();
        boolean res=program.isPositive(-5);
        System.out.println(res);

    }
    public boolean isPositive (int x) {
        if (x>0) {
            return true;
        }
        else {
            return false;
        }
    }
}
