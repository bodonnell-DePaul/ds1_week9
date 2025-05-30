package sorting;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import sorting.algorithms.*;
import sorting.utils.dc;

public class Main {
    public static void main(String[] args) throws CsvException {
        
        String dcFile = System.getProperty("user.dir")+"/sorting/utils/dc-wikia-data.csv";
        ArrayList<dc> characters = new ArrayList();
        try (CSVReader reader = new CSVReader(new FileReader(dcFile)))
        {
            List<String[]> records = reader.readAll();
            String[] headers = records.get(0); // First row is the header
            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                dc character = new dc(record);
                characters.add(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Random random = new Random();
        int[] sampleData = new int[1000]; // larger array for better performance testing
        for (int i = 0; i < sampleData.length; i++) {
            sampleData[i] = random.nextInt(100000); // random numbers 0-999
        }

        // Bubble Sort
        System.out.println("Original array for Bubble Sort:");
//        printArray(bubbleSortArray);
        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.nanoTime();
        bubbleSort.sort(sampleData);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Sorting took " + duration + " nanoseconds.");

        // Heap Sort
        System.out.println("Original array for Heap Sort:");
        //printArray(heapSortArray);
        HeapSort heapSort = new HeapSort();
        startTime = System.nanoTime();
        heapSort.sort(sampleData);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Sorting took " + duration + " nanoseconds.");

        // Quick Sort
        System.out.println("Original array for Quick Sort:");
        // printArray(quickSortArray);
        QuickSort quickSort = new QuickSort();
        startTime = System.nanoTime();
        quickSort.sort(sampleData);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Sorting took " + duration + " nanoseconds.");
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}