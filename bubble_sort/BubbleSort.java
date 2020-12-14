package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort1(int[] arr) {
        int temp;
        boolean flag;
        for (int i = 0; i < arr.length-1; i++) {
            flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }

            if(!flag) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48})));
    }
}