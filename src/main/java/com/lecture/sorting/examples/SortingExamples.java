package com.lecture.sorting.examples;
import com.lecture.sorting.algorithms.BubbleSort;
import com.lecture.sorting.algorithms.HeapSort;
import com.lecture.sorting.algorithms.QuickSort;
import com.lecture.sorting.utils.SortingUtil;

public class SortingExamples {
    public static void main(String[] args) {
        int[] array1 = SortingUtil.generateRandomArray(10);
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();

        System.out.println("Original Array:");
        SortingUtil.printArray(array1);

        // Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array1);
        System.out.println("Sorted Array using Bubble Sort:");
        SortingUtil.printArray(array1);

        // Heap Sort
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array2);
        System.out.println("Sorted Array using Heap Sort:");
        SortingUtil.printArray(array2);

        // Quick Sort
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array3);
        System.out.println("Sorted Array using Quick Sort:");
        SortingUtil.printArray(array3);
    }
}