
/**
 * Write a description of class randomNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// problem number 5
import java.util.Random;
public class randomNumbers{
    public static void main(String []args){
        Random rm = new Random();
        int ar[] = new int [5];
        int a;
        for (int i = 0; i < 5; i++){
            a = rm.nextInt(10) + 1;
            ar[i] = a * a;
            System.out.print(a + ",  ");
            System.out.println(ar[i]);
        }
    }
}
