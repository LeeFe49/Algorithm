import Sorting.QuickSort;

import java.util.Arrays;

import static Sorting.BubbleSort.bubbleSort;
import static Sorting.HeapSort.heapSort;
import static Sorting.InsertionSort.insertionSort;
import static Sorting.MergeSort.mergeSort;
import static Sorting.QuickSort.quickSort;
import static Sorting.SelectionSort.selectionSort;

public class Main {
    // 버블 정렬
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 4};
        bubbleSort(arr);
        System.out.println("BubbleSort :" + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        insertionSort(arr);
        System.out.println("InsertionSort :" + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        selectionSort(arr);
        System.out.println("SelectionSort :" + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        System.out.println("MergeSort :" + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4, 6};
        heapSort(arr);
        System.out.println("HeapSort :" + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickSort :" + Arrays.toString(arr));

    }
}
