package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int key,temp;
        for (int i = 0; i < arr.length - 1; i++) {
            key = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[key]) {
                    key = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48})));
    }
}
