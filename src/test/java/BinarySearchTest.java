import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    static void setUp() {
        binarySearch = new BinarySearch();
    }

    @org.junit.jupiter.api.Test
    void testBinarySearchForArrayWithShiftedIndex() {
        int[] inputArray = new int[]{5, 5, 1, 3, 4, 5, 5, 5, 5};
        int soughtValue = 5;
        int result = binarySearch.binarySearch(inputArray, soughtValue);
        int expectedIndex = 0;
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchDefault() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soughtValue = 5;
        int result = binarySearch.binarySearch(inputArray, soughtValue);
        int expectedIndex = 4;
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchForSameNumbers() {
        int[] inputArray = new int[]{5, 5, 7, 7, 7, 10, 10, 12, 12};
        int soughtValue = 5;
        int result = binarySearch.binarySearch(inputArray, soughtValue);
        int expectedIndex = 0;
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchForSameNumbersRightHalfOfArray() {
        int[] inputArray = new int[]{5, 5, 7, 7, 7, 10, 10, 11, 12, 12};
        int soughtValue = 12;
        int result = binarySearch.binarySearch(inputArray, soughtValue);
        int expectedIndex = 7;
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchForNonexistentKey() {
        int[] inputArray = new int[]{5, 5, 7, 7, 7, 10, 10, 11, 12, 12};
        int soughtValue = 13;
        int result = binarySearch.binarySearch(inputArray, soughtValue);
        int expectedIndex = -1;
        assertEquals(expectedIndex, result);
    }
}