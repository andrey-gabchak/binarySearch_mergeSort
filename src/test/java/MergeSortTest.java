import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private static MergeSort mergeClass;
    @BeforeAll
    static void setUp() {
        mergeClass = new MergeSort();
    }

    @Test
    void mergeSort() {
        int[] inputArray = new int[] {2100, 23, 40, 24, 2, 1, 10, 18, 11};
        int[] expectedArray = new int[]{1, 2, 10, 11, 18, 23, 24, 40, 2100};
        int[] actualArray = mergeClass.mergeSort(inputArray);
        assertArrayEquals(expectedArray, actualArray);
    }
}