import java.util.*;  
class UserInputDemo   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);     
System.out.print("Enter first number- ");  
int a= sc.nextInt();  
System.out.print("Enter a string: ");  
String str= sc.nextLine();         
System.out.print("You have entered: "+str);
System.out.println("Enter your salary: ");
double salary = input.nextDouble();
System.out.println("Salary- " + salary);
boolean bn = sc.nextBoolean();  
  if (bn == true) {  
 System.out.println("You are over 18");  
  } else if (bn == false) {  
 System.out.println("You are under 18");  
  }  
  sc.close();
  
}  
} 
