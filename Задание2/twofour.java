package Задание2;

import java.util.Scanner;

public class twofour {
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

        twofour program = new twofour();
        String res = program.makeDecision(x,y);
        System.out.println(res);
    }

    public String makeDecision (int x, int y) {
        if (x>y) {
            return (x+">"+y);
        }
        else if (x<y) {
            return (x+"<"+y);
        }
        else {
            return (x+"=="+y);
        }
    }
}