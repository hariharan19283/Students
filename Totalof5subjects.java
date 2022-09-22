CG2576
HARI HARAN
import java.util.Scanner;
public class Totalof5subjects
{
private static Scanner SC;
public static void main(String[]args)
{
int english,chemistry,computers,physics,maths;
sc = new Scanner(System.in);
System.out.print("please Enter the five subjects marks:");
english= SC.nextint();
chemistry= SC.nextint();
computers= SC.nextint();
physics= SC.nextint();
maths= SC.nextint();
totalmarks(english,chemistry,computers,physics,maths);
}
public static void totalmarks(int eng,int chem,int com,int phy,int math)
{
float total,percentage;
Boolean Result;
total = eng+chem+com+phy+math;
Average=total/5;
Result=(total>40);
System.out.println("total marks = "+Total);
System.out.println("average marks = "+Average);
System.out.println("Result ="+Percentage);
}
}