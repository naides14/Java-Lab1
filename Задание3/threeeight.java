package Задание3;

import java.util.Scanner;

public class threeeight {
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

        threeeight program = new threeeight();
        program.leftTriangle(x);
    }

    public void leftTriangle(int x) {
        int rownum=0;
        for (int i=0;i<x;i++) {
            rownum+=1;
            System.out.println("*".repeat(rownum));
        }
    }
}