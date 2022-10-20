import java.io.*;  
class ThreadJoin extends Thread  
{  
  public void run()  
{  
for (int j = 0; j < 2; j++)  
{  
try  
{  
// sleeping the thread for 300 milli seconds  
Thread.sleep(300);  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
}  
// catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught: " + e);  
}  
System.out.println( j );  
}  
}  
}  
  
public class ThreadJoin 
{  
public static void main (String argvs[])  
{  
ThreadJoin th1 = new ThreadJoin();  
ThreadJoin th2 = new ThreadJoin();  
ThreadJoin th3 = new ThreadJoin();  
th1.start();  
try  
{  
System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
th1.join();  
}  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  
th2.start();  
try  
{  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
th2.join();  
}  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  
th3.start();  
}  
}