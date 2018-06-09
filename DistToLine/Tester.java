import java.io.*;
import java.util.*;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tester{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = input.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B= input.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = input.nextDouble();
        System.out.print("Enter the x value for the line: ");
        double x = input.nextDouble();
        System.out.print("Enter the y value for the line: ");
        double y = input.nextDouble();
        System.out.println("Distance from the point to the line is: " + DistToLine.getDist(x,y));       
    }
}
