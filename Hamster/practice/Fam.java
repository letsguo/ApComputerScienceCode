
/**
 * Write a description of class Fam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Problem #3
import java.io.*;
import java.util.*;
public class Fam{
    public static void main(String []args){
        Scanner kbReader = new Scanner(System.in);
        int num[] = new int [4];
        double total = 0;
        for (int i = 0; i<4; i++){
            System.out.println("How much was spent on family member " + (i+1));
            num [i] = kbReader.nextInt();
            total += num[i];            
        }
        System.out.println("The total spent on the family is " + total);
    }
    
}
