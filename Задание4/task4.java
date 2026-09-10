package Задание4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        task4 program = new task4();
        int[] trasharr = {0};
        int res4_1=program.findLast(trasharr,0);
        System.out.println(res4_1);
        int res4_2=program.findFirst(trasharr,0);
        System.out.println(res4_2);
        int[] res4_4=program.add(trasharr,0,0);
        System.out.println(Arrays.toString(res4_4));
        int[] res4_7=program.reverseBack(trasharr);
        System.out.println(Arrays.toString(res4_7));
        int[] res4_10=program.deleteNegative(trasharr);
        System.out.println(Arrays.toString(res4_10));

    }

    public int findFirst (int[] arr, int x) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int[] arrayy = {14,5,2008,16,11};
        arr=arrayy;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]== x1) {
                return i;
            }

        }
        return -1;
    }

    public int findLast (int[] arr, int x) { //задача 2
        Scanner scanner = new Scanner(System.in);
        int x1;
        int[] arrayy = {14,14,5,2008,16,2008,11,11,11,11};
        arr=arrayy;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        int lastseen=-1;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]== x1) {
                lastseen = i;
            }
        }
        return lastseen;
    }
    public int[]add (int[] arr, int x, int pos) {

        Scanner scanner = new Scanner(System.in);
        int x1;
        int pos1;
        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};
        arr=arrayy;
        System.out.println("Длина массива: "+arrayy.length);
        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите целое число (позицию для вставки в массив):");
            if (scanner.hasNextInt()) {
                pos1 = scanner.nextInt();
                if (pos1 <0 || pos1 >arrayy.length+1) {
                    System.out.println("Введено не целое число, либо число меньше/больше длины массива!");
                    scanner.next();
                }
                else {
                    break;
                }
            }
        }

        int[] newarr =  new int[arr.length+1];
        for (int i = 0; i < newarr.length; i++) {

            if (i < pos1) {
                newarr[i] = arr[i];
            }
            else if (i == pos1) {
                newarr[i] = x1;
            }
            else {
                newarr[i] = arr[i - 1];
            }
        }
        return newarr;
    }
    public int[] reverseBack (int[] arr) {
        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};
        arr=arrayy;
        int[] newarr =  new int[arr.length];
        int newindex=0;
        for (int i = arr.length-1; i > -1; i--) {
            newarr[newindex]=arr[i];
            newindex+=1;
        }
        return newarr;
    }
    public int[] deleteNegative (int[] arr) {

        int[] arrayy = {-1,-2,3,14,5,-514,885,-4};
        arr=arrayy;
        int[] newarr = new int[arr.length];
        for (int j = 0; j < newarr.length; j++) {
            if (arr[j] >= 0) {
                newarr[j] = arr[j];
            }
        }

        int truelen=0;
        for (int i=0; i<newarr.length; i++) {
            if (newarr[i] != 0) {
                truelen += 1;
            }
        }

        int[] finalarr = new int[truelen];
        int finalind=0;
        for (int k=0;k<newarr.length;k++) {
            if (newarr[k]>0) {
                finalarr[finalind]=newarr[k];
                finalind+=1;
            }
        }
        return finalarr;
    }
}