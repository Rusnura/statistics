import org.junit.Assert;
import org.junit.Test;
import statistics.Deviation;
import statistics.utils.DoubleUtils;

public class DeviationTest {
    @Test
    public void averageTest() {
        double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = Deviation.getAverage(values);
        Assert.assertEquals(5.5, DoubleUtils.round(average, 1), 0);
    }

    @Test
    public void standardDeviationTest() {
        double[] values = {1, 5, 2, 7, 1, 9, 3, 8, 5, 9};
        double standardDeviation = Deviation.getStandardDeviation(values, 1);
        Assert.assertEquals(3.16, DoubleUtils.round(standardDeviation, 2), 0);
    }
}
