public class Main {
    public static void main(String[] args) {
        // Example usage of sorting algorithms
        int[] bubbleSortArray = {64, 34, 25, 12, 22, 11, 90};
        int[] heapSortArray = {64, 34, 25, 12, 22, 11, 90};
        int[] quickSortArray = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        System.out.println("Original array for Bubble Sort:");
        printArray(bubbleSortArray);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(bubbleSortArray);
        System.out.println("Sorted array using Bubble Sort:");
        printArray(bubbleSortArray);

        // Heap Sort
        System.out.println("Original array for Heap Sort:");
        printArray(heapSortArray);
        HeapSort heapSort = new HeapSort();
        heapSort.sort(heapSortArray);
        System.out.println("Sorted array using Heap Sort:");
        printArray(heapSortArray);

        // Quick Sort
        System.out.println("Original array for Quick Sort:");
        printArray(quickSortArray);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(quickSortArray);
        System.out.println("Sorted array using Quick Sort:");
        printArray(quickSortArray);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}