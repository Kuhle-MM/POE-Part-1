package st10259861.poe;
import javax.swing.JOptionPane;

public class ST10259861POE {
    
    public static void main(String[] args) {
        //Gets user input 
    String strUsername = JOptionPane.showInputDialog("Enter your username: "); 
    while ((strUsername.length()>5) || (!strUsername.contains(String.valueOf("_"))) )
    {
        System.out.println("Not valid a valid username it must be less than 5 characters and must contain an underscore(_) ");
         strUsername = JOptionPane.showInputDialog("Enter your username: ");
    }
        System.out.println("Username successfully captured."); 
        
        
    String strPassword = JOptionPane.showInputDialog("Enter your new Password");
    
//    while (strPassword.length()<8 || )
//    String strFirstName = JOptionPane.showInputDialog("Enter your first name");
//    String strLastName = JOptionPane.showInputDialog("Enter your last name");
    
    
        for (int i = 0; i < strPassword.length(); i++) {
            char currentChar = strPassword.charAt(i);
            
          if (!Character.isDigit(currentChar)){
              System.out.println("has no digit");
          } else {
              System.out.println("Has digit");
        }
        }
    }
}
          
                        
