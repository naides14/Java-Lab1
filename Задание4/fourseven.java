package Задание4;

import java.util.Arrays;

public class fourseven {
    public static void main(String[] args) {

        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};

        fourseven program = new fourseven();
        int[] res=program.reverseBack(arrayy);
        System.out.println(Arrays.toString(res));
    }

    public int[] reverseBack (int[] arr) {

        int[] newarr =  new int[arr.length];
        int newindex=0;
        for (int i = arr.length-1; i > -1; i--) {
            newarr[newindex]=arr[i];
            newindex+=1;
            }
        return newarr;
        }
    }
