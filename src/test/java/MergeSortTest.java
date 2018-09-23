import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private static MergeSort mergeClass;

    @BeforeAll
    static void setUp() {
        mergeClass = new MergeSort();
    }

    @Test
    void testMergeSort() {
        int[] inputArray = new int[]{2100, 23, 40, 24, 2, 1, 10, 18, 11, 25, 13, 17, 9, 3};
        int[] expectedArray = new int[]{1, 2, 3, 9, 10, 11, 13, 17, 18, 23, 24, 25, 40, 2100};
        mergeClass.mergeSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }
}