import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSortWithUnsortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        bubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithReverseSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithSingleElementArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {42};
        int[] expected = {42};
        bubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithEmptyArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {};
        int[] expected = {};
        bubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }
}