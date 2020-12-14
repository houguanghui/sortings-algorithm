package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int key;
        int j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i -1; j >= 0 && key < arr[j];j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48})));
    }
}
