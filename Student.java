import java.util.Scanner;

public class Student
{
    String name;
    int id;
    int m1;
    int m2;
    int m3;
    

    public Student(String n, int i, int s1, 
    int s2, int s3) {
        name = n;
        id = i;
        m1 = s1;
        m2 = s2;
        m3 = s3;
    }

    public Student() {
        name = "";
        id = 0;
        m1 = 0;
        m2 = 0;
        m3 = 0;
      
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter id: ");
        id = in.nextInt();
        System.out.print("Enter Subject 1 Marks: ");
        m1 = in.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        m2 = in.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        m3 = in.nextInt();
    }

   

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Subject 1 Marks: " + m1);
        System.out.println("Subject 2 Marks: " + m2);
        System.out.println("Subject 3 Marks: " + m3);
      }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.accept();
        obj.display();
    }
}