package shell_sort;

import java.util.Arrays;

public class ShellSort {

    public static int[] shellSort(int[] arr) {
        int step = 1;
        int temp;
        int j;


        while (step < arr.length / 3) {
            step = step * 3 + 1;
        }

        while(step >= 1) {

            for (int i = step; i < arr.length; i++) {
                temp = arr[i];
                for(j = i;j - step >=0 && temp < arr[j - step];j-=step) {
                    arr[j] = arr[j - step];
                }
                arr[j] = temp;
            }
            step = step / 3;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48})));
    }
}