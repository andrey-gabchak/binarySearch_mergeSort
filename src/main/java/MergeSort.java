import java.util.Arrays;

public class MergeSort {

    void mergeSort(int[] inputArray, int leftIndex, int rightIndex) {

        if (rightIndex <= leftIndex) {
            return;
        }

        if (leftIndex + 1 < rightIndex) {

        }
        int mid = leftIndex + (rightIndex - leftIndex) / 2;
        mergeSort(inputArray, leftIndex, mid);
        mergeSort(inputArray, mid + 1, rightIndex);

        int[] bufferArray = Arrays.copyOf(inputArray, inputArray.length);

        for (int k = leftIndex; k <= rightIndex; k++) {
            bufferArray[k] = inputArray[k];
        }

        int firstIndex = leftIndex, lastIndex = mid + 1;

        for (int i = leftIndex; i <= rightIndex; i++) {

            if (firstIndex > mid) {
                inputArray[i] = bufferArray[lastIndex];
                lastIndex++;
            } else if (lastIndex > rightIndex) {
                inputArray[i] = bufferArray[firstIndex];
                firstIndex++;
            } else if (bufferArray[lastIndex] < bufferArray[firstIndex]) {
                inputArray[i] = bufferArray[lastIndex];
                lastIndex++;
            } else {
                inputArray[i] = bufferArray[firstIndex];
                firstIndex++;
            }
        }
    }

}
