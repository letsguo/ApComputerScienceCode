
/**
 * Write a description of class nameThatCelebrity here.
 *
 * @author Gabriel Guo
 * @version (a version number or a date)
 */
public class nameThatCelebrity {
    public static void main(String []args) {
        String s1 = "Allen Alda"; //Assigns the names to the variables
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        
        int len = s1.length(); //Gets length of each name
        int lenTwo = s2.length();
        int lenThree = s3.length();
        
        String first = s1.substring(2, len - 3); //Drops first two letters and last three
        String second = s2.substring(2, lenTwo - 3); 
        String third = s3.substring(2, lenThree - 3);
        
        System.out.println(s1 + ">>>" + first); //Prints out new name with first two 
        System.out.println(s2 + ">>>" + second); //and last three letters dropped with >>> in between
        System.out.println(s3 + ">>>" + third);
        

    
    
    }
}
