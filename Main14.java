import java.io.*;
  public class Main14 {
    public static void main(String[] args)
    {
        Console cnsl
            = System.console();
  
        if (cnsl == null) {
            System.out.println(
                "No console available");
            return;
        }
  
        String str = cnsl.readLine(
            "Enter username : ");
  
        System.out.println(
            "Username : " + str);
         char[] ch = cnsl.readPassword(
            "Enter password : ");
  
         System.out.println(
            "Password : " + ch);
    }
}