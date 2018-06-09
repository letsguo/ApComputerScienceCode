
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle{
    public double radius;
    public Circle(double r){
        radius = r;

    }
    
    public double diameter(){
        //double d = 2*radius;
        //return d;
        return (2*radius);
    
    }    
    public double circumference(){
        double c = 2 * Math.PI * radius;
        return c;
    }
    public double area(){
        double area = Math.PI * radius * radius;
        return area;
    }
}

