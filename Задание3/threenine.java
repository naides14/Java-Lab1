package Задание3;

import java.util.Scanner;

public class threenine {
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

        threenine program = new threenine();
        program.rightTriangle(x);
    }

    public void rightTriangle(int x) {
        int rownum=0;
        int spacenum=x-1;
        for (int i=0;i<x;i++) {
            rownum+=1;
            System.out.println(" ".repeat(spacenum)+"*".repeat(rownum));
            spacenum-=1;

        }
    }
}