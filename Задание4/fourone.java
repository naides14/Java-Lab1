package Задание4;

import java.util.Scanner;

public class fourone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int[] arrayy = {14,5,2008,16,11};

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        fourone program = new fourone();
        int res=program.findFirst(arrayy,x);
        System.out.println(res);

    }

    public int findFirst (int[] arr, int x) {
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]==x) {
                return i;
            }

        }
        return -1;
    }
}
