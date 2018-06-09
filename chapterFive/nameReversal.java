
/**
 * Write a description of class nameReversal here.
 *
 * @author Gabriel Guo
 * @version (9/21/17)
 */
import java.io.*;
import java.util.*;
public class nameReversal {
    public static void main(String []args) {
        System.out.print("Please enter your name "); 
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine(); //Keyboard input for name
        
        name = name.toLowerCase(); //Changes name to lower case
        int letter = name.length(); //Gets length
        
        for(int i = 1; i <= letter; i++) {
            System.out.print(name.substring(letter - i, (letter - i) + 1)); //Prints each letter starting from the back of the name going to the front
        }
    }    

}
