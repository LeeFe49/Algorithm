package Sorting;

import java.util.Arrays;

public class BubbleSort extends Swap {
    // 버블 정렬
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
