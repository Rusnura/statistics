import org.junit.Assert;
import org.junit.Test;
import statistics.utils.SortUtils;

public class SortUtilsTest {
    @Test
    public void quickSortTest() {
        int[] arr = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        int low = 0;
        int high = arr.length - 1;

        SortUtils.quickSort(arr, low, high);
        int[] expectedArray = {-3, 0, 3, 4, 7, 7, 8, 10, 12};
        Assert.assertEquals(expectedArray.length, arr.length);
        Assert.assertArrayEquals(expectedArray, arr);
    }
}
