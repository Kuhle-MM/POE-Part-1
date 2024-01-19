package st10259861.poe;


import javax.swing.JOptionPane;


public class Login {
    public static boolean isValidDigit = false, isValidSymbol = false, isValidCase = false;
    public static boolean validUsername = false, validPassword = false, validLogin = false;
    public static String loginPrompt;//strUsername,strPassword
    
    public boolean CheckUsername(String strUsername) {
                
        validUsername = (strUsername.length() <= 5) && (strUsername.contains(String.valueOf("_"))); 

        return validUsername;
    }

    //gets input from the user for the password and checks whether the password is valid or not
    public  boolean CheckPassword(String strPassword) {
        char currentChar;
       
        for (int i = 0; i < strPassword.length(); i++) {
            currentChar = strPassword.charAt(i);

            if (Character.isDigit(currentChar)) {
                isValidDigit = true;
            }
            if (Character.isUpperCase(currentChar)) {
                isValidCase = true;
            }
            if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)) {
                isValidSymbol = true;
            }
        }
        
        //doesnt change value of valid password
        validPassword = (strPassword.length() >= 8 || isValidDigit == true || isValidCase == true || isValidSymbol == true);
        
        return validPassword;
    }
   
    public  String registerUser(boolean validUsername, boolean validPassword){
        String statement1;
        String statement2;
            if (validUsername == false){
                statement1 = ("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            } else
                statement1 = "Username successfully captured";
           
            if (validPassword == false){
               statement2 = ("\nor Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            }else
                 statement2 = "\nPassword successfully captured";
           
       
       return (statement1 + statement2);
       // return
    }

    //gets new inputs from the user for the login username and the login password and checks if it is valid and they can log in
    public  boolean LoginCheck(String logUsername, String logPassword,String firstName,String surname,String strUsername,String strPassword) {
         logUsername = JOptionPane.showInputDialog("Enter your login Username: ");
        logPassword = JOptionPane.showInputDialog("Enter your login password: ");

        while (!logUsername.equals(strUsername) || !logPassword.equals(strPassword)) {
            logUsername = JOptionPane.showInputDialog("Username is incorrect try again");
            logPassword = JOptionPane.showInputDialog("Enter your login password: ");
        }
        if (logUsername.equals(strUsername) && logPassword.equals(strPassword)){
        System.out.println("Welcome " + firstName + ", " + surname +  " it is great to see you again");
        return validLogin = true;
        } else{
            System.out.println("Username or password incorrect, please try again");
            return validLogin = false;
        }
    }
    
    public  String returnLoginStatus(){
        //takes in checkUser and checkPass 
        if (validLogin == true)
            return "A successful login";
        else
            return "A unsuccessful login";
    }
}
