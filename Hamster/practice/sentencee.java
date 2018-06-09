
/* Gabriel Guo
 * Problem #7
 * 10/27/17
 * I didn't get how to store it in an array because you don't know the number of elements in the array at the start?
 * I used array list since you can add elements as you go.
 */
import java.util.*;
import java.io.*;
public class sentencee{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Type a sentence");
        String s = kb.nextLine();           
        s = s.toLowerCase().trim().replaceAll("\\s+", "");
        List<String>  g = new ArrayList<String>();  
        String eachLetter;
        int indexf = 1;
        int total = 1;
        int i = 0; 
        eachLetter = s.substring(i, i+1);   //First index     
        String n = s.substring(s.length()-1); //n = last index
        String m = s.substring(s.length()-2, s.length()-1); //m = second to last index
 
        while (!(n.equals("%") && m.equals("%"))){     //Runs until last two indices = %
            eachLetter = s.substring(i, i+1);  //eachLetter stores an index every loop iteration
            if (eachLetter.equals("%")){ //loop goes to next index if already counted
                i++; //Goes to next index
                eachLetter = s.substring(i, i+1); //Stores next index in eachLetter
                continue; 
            }
            indexf = s.indexOf(eachLetter, i+1); //Finds if there are any more letters
            while (indexf >= 1){                 //that are the same as each letter in the sentence
                total++; //Counts how many of that letter is in the sentence
                indexf = s.indexOf(eachLetter, indexf+1);  //Looks for letter but starts 1 index up
            }
            g.add(eachLetter + " = " + total + " times"); //This string is added to the Array List
            s = (s.replaceAll(eachLetter, "%"));  //Replaces all of eachLetter so it's not stored again
            i++; //Goes to next index
            total = 1; 
            m = s.substring(s.length()-2, s.length()-1); //Updates n and n
            n = s.substring(s.length()-1);            
        }
        
        for (int x = 0; x < g.size(); x++){
                System.out.println(g.get(x));  //Prints out each element of ArrayList   
        }
    }
}
