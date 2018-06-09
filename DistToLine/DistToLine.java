
/**
 * Write a description of class DistToLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DistToLine
{
    public static double A;
    public static double B;
    public static double C;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static double getDist(double a, double b)
    {
        double distance;
        distance = Math.abs(A*a + B*b + C) / Math.sqrt(A*A + B*B);
        return distance;
    }
}
