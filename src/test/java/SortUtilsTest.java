import org.junit.Assert;
import org.junit.Test;
import statistics.utils.SortUtils;

public class SortUtilsTest {
    @Test
    public void quickSortTest() {
        int[] arr = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        int low = 0;
        int high = arr.length - 1;

        long startTime = System.nanoTime();
        SortUtils.quickSort(arr, low, high);
        long sortingTime = System.nanoTime() - startTime;
        int[] expectedArray = {-3, 0, 3, 4, 7, 7, 8, 10, 12};
        Assert.assertEquals(expectedArray.length, arr.length);
        Assert.assertArrayEquals(expectedArray, arr);
        System.out.println("quickSortTest(): Sorting time = " + sortingTime + " ns.");
    }

    @Test
    public void quickSortTest_whenArrayOrderIsReversed() {
      int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      int low = 0;
      int high = arr.length - 1;

      long startTime = System.nanoTime();
      SortUtils.quickSort(arr, low, high);
      long sortingTime = System.nanoTime() - startTime;
      int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Assert.assertEquals(expectedArray.length, arr.length);
      Assert.assertArrayEquals(expectedArray, arr);
      System.out.println("quickSortTest_whenArrayOrderIsReversed(): Sorting time = " + sortingTime + " ns.");
    }
}
