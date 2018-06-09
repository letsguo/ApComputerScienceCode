
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester{
    public static void main(String[] args){
        char ch[] = new char[25];
        int a = 0;
        for(int i = 65; i<=90; i++){
            ch[a] = (char)(i);
            a++;
            for(int j = 0; i <=25; i++){
                System.out.println(ch[j]);
                if (j !=0){
                    System.out.println(", ");
                }
            }    
         }
    }
}