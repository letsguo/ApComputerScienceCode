
/**
 * Write a description of class BankAccount here.
 *
 * @author Gabriel Guo
 * @version 10/18/17
 */
public class BankAccount{
    public double balance;
    public String name;
    public BankAccount(double b, String n){ 
        balance = b;
        name = n;   
    }
    public void deposit(double amountMoney){
        //balance = balance + amountMoney;
        balance += amountMoney;        
    }
    public void withdraw(double takenMoney){
        //balance = balance - takenMoney;
        balance -= takenMoney;
    }

}
