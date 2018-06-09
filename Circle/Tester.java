
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester{
    public static void main (String []args){
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(5);
        
        double radcir1 = circle1.radius;
        
        System.out.println("If the raidus of your circle is " + radcir1);
        System.out.println("Then the diameter of your circle is " + circle1.diameter());
        System.out.println("The circumference of your circle is " + circle1.circumference());
        System.out.println("And at last the are Area is " + circle2.area());
        
    }
}
