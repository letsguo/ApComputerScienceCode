
/**
 * Write a description of class LinearFunction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinearFunction implements LinearFunctionMethods{
    // instance variables - replace the example below with your own
    double slope;
    double yIntc;
    double root;
    /**
     * Constructor for objects of class LinearFunction
     */
    public LinearFunction(double s, double y)
    {
        slope = s;
        yIntc = y;
       
    }

    public double getSlope(){        
        return slope;
    }
    
    public double getYintercept(){
        return yIntc;               
    }
    
    public double getRoot(){
        root = -yIntc/slope;
        return root;
    }
    
    public double getYvalue(double x){
        double yValue;
        yValue = slope * x + yIntc;
        return yValue;
        
    }
    
    public double getXvalue(double y){
        double xValue;
        xValue = (y-yIntc)/slope;
        return xValue;
    }
}
