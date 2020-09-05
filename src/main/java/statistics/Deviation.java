package statistics;

public class Deviation {
    public static double getAverage(double[] values) {
        double sum = 0;
        for (double v: values) {
            sum += v;
        }
        return sum / values.length;
    }

    public static double getDispersion(double[] values, int degreesOfFreedom) {
        double average = getAverage(values);
        double sumOfPowers = 0;
        for (double v : values) {
            sumOfPowers += Math.pow((v - average), 2);
        }

        return sumOfPowers / (values.length - degreesOfFreedom);
    }

    public static double getStandardDeviation(double[] values, int degreesOfFreedom) {
        double dispersion = getDispersion(values, degreesOfFreedom);
        return Math.sqrt(dispersion);
    }
}
