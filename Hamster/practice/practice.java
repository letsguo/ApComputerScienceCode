
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class practice{
    public static void main(String []args){
        Scanner kbReader = new Scanner(System.in);
        String names[] = new String[5];
        //int x = names.length
        for (int x = 0; x < names.length; x++){
            System.out.println("Type in a name");
            names[x] = kbReader.nextLine();
        }
        for (int x = 0; x < names.length; x++){
            System.out.print(names[x].toUpperCase() + ",");
        }
    }
}
    
    

