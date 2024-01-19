package st10259861.poe;
<<<<<<< HEAD


import javax.swing.JOptionPane;


public class ST10259861POE {

    public static boolean isValidDigit = false, isValidSymbol = false, isValidCase = false;
    public static boolean validUsername = false, validPassword = false, validLogin = false;
    public static String strUsername,strPassword,loginPrompt,firstName,surname,logPassword, logUsername;


    public static void main(String[] args) {
        
        firstName = JOptionPane.showInputDialog("Enter your First name: ");
        surname = JOptionPane.showInputDialog("Enter your Surname: ");
        strUsername = JOptionPane.showInputDialog("Enter your new username");
        strPassword = JOptionPane.showInputDialog("Enter your new password");
        
        
        Login user = new Login();
        
        
         while (user.CheckPassword(strPassword) == false || user.CheckUsername(strUsername) == false){
        System.out.println( user.registerUser(user.CheckUsername(strUsername),user.CheckPassword(strPassword)));

        
        logUsername = JOptionPane.showInputDialog("Enter your new username");
        logPassword = JOptionPane.showInputDialog("Enter your new password");
         }
         
        loginPrompt = JOptionPane.showInputDialog("Would you like to log in? Y or N?");
        if (loginPrompt.equalsIgnoreCase("Y"))
        user.LoginCheck(logUsername , logPassword , firstName, surname,strUsername,strPassword);
    }

}
//Understanding For Loop in Java With Examples and Syntax
//https://www.simplilearn.com/tutorials/java-tutorial/for-loop-in-java#:~:text=For%20loop%20in%20Java%20iterates,the%20condition%20is%20not%20met.
//by: simpliliearn

//Conditionals and control flow in Java programs.
//https://www.codecademy.com/courses/learn-java/lessons/java-boolean-operators/exercises/review
//by: anon

//What Does Class Mean?
//https://www.techopedia.com/definition/3214/class-java#:~:text=A%20class%20in%20Java%20is,of%20the%20%E2%80%9Ccats%E2%80%9D%20class.
//by: Margaret Rouse
=======
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
          
                        
>>>>>>> e255a01fabb3832d5f7a6f77a530ed57250d6693
