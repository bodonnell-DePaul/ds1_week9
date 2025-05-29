import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testSortWithUnsortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {3, 6, 8, 10, 1, 2, 1};
        int[] expected = {1, 1, 2, 3, 6, 8, 10};
        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithReverseSortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {};
        int[] expected = {};
        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithSingleElementArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {42};
        int[] expected = {42};
        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }
}