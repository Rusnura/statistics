package statistics.utils;

public class SortUtils {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        // Select a middle element
        int middle = low + (high - low) / 2;
        int middleElement = array[middle];

        // Separate to two parts:
        // First part contains all elements which GREATER than middle element
        // Second part contains all elements which LESS than middle element
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }

            while (array[j] > middleElement) {
                j--;
            }

            // Swap elements
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            // Call recurse function for left and right parts
            if (low < j)
                quickSort(array, low, j);
            if (high > i)
                quickSort(array, i, high);
        }
    }
}
