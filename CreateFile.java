import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class CreateFile
{
    public static void main(String[] args) throws IOException
int ch;
 
        FileReader fr=null;
        try
        {
            fr = new FileReader("text");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
 
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch)
    {
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
        FileWriter fw=new FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
         System.out.println("Writing successful");
       fw.close();
    }
} 
