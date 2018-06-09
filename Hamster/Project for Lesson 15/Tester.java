
/**
 * Write a description of class Tester here.
 *
 * @author Gabriel Guo
 * @version 10/18/17
 */
import java.io.*;
import java.util.*;
public class Tester{
    public static void main(String []args){
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is your name");
        String nam = kbReader.nextLine();
        System.out.println("Enter your initial account amount. ");
        double num = kbReader.nextDouble();
        
        BankAccount myAccount = new BankAccount(num, nam);
        
        double bal = myAccount.balance;
        String yy = myAccount.name;
        
        String t;
        do {
            System.out.print("\n1. deposit \n2. withdrawl \n3. balance");
            String choice = kbReader.next();
            char ch = choice.charAt(0);
            switch(ch){
                case '1':
                    System.out.println("\nHow much would you like to deposit");
                    double d = kbReader.nextDouble();
                    myAccount.deposit(d);
                break;
                case '2':
                    System.out.println("\nHow much would you like to withdraw");
                    double w = kbReader.nextDouble();
                    myAccount.withdraw(w);
                break; 
                case '3':
                    System.out.println("\nYour balance is " + myAccount.balance);
                    
                
            }
            
            System.out.println("\n" + yy + ", your new accont balance is " + myAccount.balance + ".\n");
            System.out.println("\nWould you like to make another transaction? Enter y for yes and n for no");
            t = kbReader.next();
        }
        while (t.equals("y"));
        
        
        
        //myAccount.deposit(505.22);
        //System.out.println(myAccount.balance);
        //myAccount.withdraw(100);
        //System.out.println("The " + nam + " account balance is, $" + (myAccount.balance));
        
    
    

    }
}
    