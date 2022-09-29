public class Customer 
{  
int account number;
String account type;  
  
customer(String amt field, String account type, int account number)
{  
this.amt field = amt field;  
this.account type = account tye;  
this.account number = account number;  
}  
  
customer(int account number, String account type)
{  
this("50395513351", "savings", 2018);  
this("50395513352", "savings", 2019);  
this.account number = account number;  
this.account type = account type;  
}  
  
public static void main(String[] args) 
{  
customer c1 = new customer(); 
customer c2 = new customer(); 
System.out.println("Printing customer Information: \n");  
System.out.println("Name: "+s.name+"\naccount number: "+s+"\n No.: "+s.contactNo+"\naccount type: "+s.contactNo+"\naccount field: ");  
}  
}