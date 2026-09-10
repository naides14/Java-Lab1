package Задание3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        task3 program = new task3();
        program.reverseListNums(5);
        program.chet(9);
        boolean res_3_6 = program.equalNum(0);
        System.out.println(res_3_6);
        program.leftTriangle(0);
        program.rightTriangle(0);
    }

    public String reverseListNums (int x) { //задача 1 (2 в лаб)
        for (int i=x; i>-1; i--) {
        System.out.print(i+" ");
        }
        return null;
    }
    public String chet (int x) { //задача 2 (3 в лаб)
        System.out.println("");
        for (int i=0; i<=x; i+=2) {
            System.out.print(i+" ");
        }
        return null;
    }
    public boolean equalNum(int x) { //задача 3 (6 в лаб)
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
        int first = x1 / 10;
        int last = x1 % 10;
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
    public void leftTriangle(int x) { //задача 4 (8 в лаб)
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
        int rownum=0;
        for (int i = 0; i< x1; i++) {
            rownum+=1;
            System.out.println("*".repeat(rownum));
        }
    }
    public void rightTriangle(int x) { //задача 5 (9 в лаб)
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
        int rownum=0;
        int spacenum= x1 -1;
        for (int i = 0; i< x1; i++) {
            rownum+=1;
            System.out.println(" ".repeat(spacenum)+"*".repeat(rownum));
            spacenum-=1;
        }
    }
}
