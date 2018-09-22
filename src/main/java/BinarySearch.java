public class BinarySearch {

    int binarySearch(int[] array, int key) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) >>> 1;
            int midValue = array[midIndex];
            if (key > midValue) {
                leftIndex = midIndex + 1;
            } else if (key < midValue) {
                rightIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
