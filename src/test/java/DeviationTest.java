import org.junit.Assert;
import org.junit.Test;
import statistics.Deviation;
import statistics.utils.DoubleUtils;

public class DeviationTest {
    @Test
    public void standardDeviationTest() {
        double[] values = {1, 5, 2, 7, 1, 9, 3, 8, 5, 9};
        double standardDeviation = Deviation.getStandardDeviation(values, 1);
        Assert.assertEquals(3.16, DoubleUtils.round(standardDeviation, 2), 0.0);
    }
}
