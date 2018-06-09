
/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord{
    private int[] scores;

    /**
     * Constructor for objects of class StudentRecord
     */
    public StudentRecord(int[] scs){
        scores = scs;
    }

    private double average(int first, int last){
        double av = 0;
        for(int i = first; i <= last; i++){
            av += scores[i];
        }
        
        av = av/((last-first)+1);       
        return av;
    }
    
    private boolean hasImproved(){
        boolean imp;
        imp = true;
        for(int i = 1; i<scores.length; i++){
            if (scores[i-1] > scores[i]){
                imp = false;           
            }         
         }
        return imp;
    }
    
    public double finalAverage(){
        int secondHalf;
        double realAverage;
       if (hasImproved()){
            secondHalf = scores.length/2; 
            realAverage = average(secondHalf, scores.length-1);
        } else{
           realAverage = average(0, scores.length-1);
        }
        
        return realAverage;
    }
}
