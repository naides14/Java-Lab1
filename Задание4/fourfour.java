package Задание4;

import java.util.Scanner;
import java.util.Arrays;

public class fourfour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int pos;
        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Длина массива: "+arrayy.length);
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
            System.out.println("Введите целое число (позицию для вставки в массив):");
            if (scanner.hasNextInt()) {
                pos = scanner.nextInt();
                if (pos<0 || pos>arrayy.length+1) {
                    System.out.println("Введено не целое число, либо число меньше/больше длины массива!");
                    scanner.next();
                }
                else {
                    break;
                }
            }
        }

        fourfour program = new fourfour();
        int[] res=program.add(arrayy,x,pos);
        System.out.println(Arrays.toString(res));
    }

    public int[]add (int[] arr, int x, int pos) {

        int[] newarr =  new int[arr.length+1];
            for (int i = 0; i < newarr.length; i++) {

                if (i < pos) {
                    newarr[i] = arr[i];
                }
                else if (i == pos) {
                    newarr[i] = x;
                }
                else {
                    newarr[i] = arr[i - 1];
                }
            }
            return newarr;
    }
}