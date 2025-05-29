import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {

    @Test
    public void testHeapSortWithUnsortedArray() {
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(input);
        assertArrayEquals(expected, input);
    }
}