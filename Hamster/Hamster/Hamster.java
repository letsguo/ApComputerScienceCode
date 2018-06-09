
/**
 * Write a description of class Hamster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hamster{
    public String color;
    public boolean switchIsOn; //ON = True, Off = false
    public Hamster(String c){
        color = c;
        
    }
    
    public void slideSwitchOn(){
        switchIsOn = true;
    }
    
    public void slideSwitchOff(){
        switchIsOn = false;
    }
    
    public void pushButton(){
        if (switchIsOn == true){
            playSound();
            
        }
    }
    
    private void playSound(){
        //TODO: Hire an intern for free to write this method
        //until then...
        System.out.println("I'm the Hamster of Happiness, BABY!");
    
    }    
}