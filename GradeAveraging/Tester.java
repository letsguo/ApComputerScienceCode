
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester{
    public static void main (String[] args){
        int[] scores = {50, 50, 20, 80, 53};  
        int[] scores2 = {20, 50, 50, 53, 80}; 
        int[] scores3 = {20, 50, 50, 80};
        StudentRecord score1 = new StudentRecord(scores);
        StudentRecord score2 = new StudentRecord(scores2);
        StudentRecord score3 = new StudentRecord(scores3);
        
        System.out.println(score1.finalAverage());
        System.out.println(score2.finalAverage());
        System.out.println(score3.finalAverage());
    }
}
