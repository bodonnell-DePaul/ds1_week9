package com.lecture.sorting.utils;
import java.util.Arrays;
import java.util.Random;

public class PerformanceAnalyzer {

    public static void analyzeSortPerformance(SortingAlgorithm algorithm, int[] data) {
        long startTime = System.nanoTime();
        algorithm.sort(data);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Sorting took " + duration + " nanoseconds.");
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] sampleData = new int[1000]; // larger array for better performance testing
        for (int i = 0; i < sampleData.length; i++) {
            sampleData[i] = random.nextInt(1000); // random numbers 0-999
        }

        System.out.println("Performance Analysis of Sorting Algorithms:");

        System.out.println("\nBubble Sort:");
        analyzeSortPerformance(new BubbleSort(), Arrays.copyOf(sampleData, sampleData.length));

        System.out.println("\nHeap Sort:");
        analyzeSortPerformance(new HeapSort(), Arrays.copyOf(sampleData, sampleData.length));

        System.out.println("\nQuick Sort:");
        analyzeSortPerformance(new QuickSort(), Arrays.copyOf(sampleData, sampleData.length));
    }
}

interface SortingAlgorithm {
    void sort(int[] array);
}