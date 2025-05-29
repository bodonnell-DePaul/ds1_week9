import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingUtilTest {

    @Test
    void testGenerateRandomArray() {
        int size = 10;
        int[] randomArray = SortingUtil.generateRandomArray(size);
        assertEquals(size, randomArray.length);
        for (int num : randomArray) {
            assertTrue(num >= 0 && num < 100); // Assuming the random numbers are between 0 and 99
        }
    }

    @Test
    void testPrintArray() {
        int[] array = {1, 2, 3, 4, 5};
        SortingUtil.printArray(array);
        // Check console output manually or use a mocking framework to capture output
    }
}