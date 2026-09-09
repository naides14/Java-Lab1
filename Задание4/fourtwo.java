package Задание4;

import java.util.Scanner;

public class fourtwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int[] arrayy = {14,14,5,2008,16,2008,11,11,11,11};

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        fourtwo program = new fourtwo();
        int res=program.findLast(arrayy,x);
        System.out.println(res);

    }

    public int findLast (int[] arr, int x) {
        int lastseen=-1;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]==x) {
                lastseen = i;
            }

        }
        return lastseen;
    }
}