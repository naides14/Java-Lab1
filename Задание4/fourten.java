package Задание4;

import java.util.Arrays;

public class fourten {
    public static void main(String[] args) {

        int[] arrayy = {-1,-2,3,14,5,-514,885,-4};

        fourten program = new fourten();
        int[] res=program.deleteNegative(arrayy);
        System.out.println(Arrays.toString(res));
    }

    public int[] deleteNegative (int[] arr) {

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



