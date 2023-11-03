/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package passowordvalidatorice4;
import java.util.Scanner;
/**
 *
 * @author asma
 */
public class PassowordValidatorICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        // Paasword , check the min8, upper,one special char
       
       Scanner input = new Scanner(System.in);
       String password = input.next(); // nextline only if it is a line but we taking word so next only
       
       if (checkLength(password) && checkUpper(password) && checkSpecial(password)  )
       {
          System.out.println("The password is valid");
       } 
       else 
       {
           System.out.println("The password is not valid");
       }
    }
    
    public static boolean checkLength(String pass)
    {
        if(pass.length()>=8)
        {
            return true;
        }
    
    return false;
    }
     public static boolean checkUpper(String pass)
    { 
        for (int i = 0; i < pass.length(); i++) 
        {
           if (Character.isUpperCase(pass.charAt(i))) 
           {
            return true;
            }
        }
            return false;
    }   

public static boolean checkSpecial(String pass)
{   
    if ((pass.contains("@") || pass.contains("#")  
            || pass.contains("!") || pass.contains("~")
            || pass.contains("$") || pass.contains("%")
            || pass.contains("^") || pass.contains("&")
            || pass.contains("*") || pass.contains("(")
              || pass.contains(")") || pass.contains("-")
              || pass.contains("+") || pass.contains("/")
              || pass.contains(":") || pass.contains(".")
              || pass.contains(", ") || pass.contains("<")
              || pass.contains(">") || pass.contains("?")
              || pass.contains("|")))
               {
               return true;  
            }
                 return false;    
    }
}
