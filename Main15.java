import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
 public class Main15 {
 
    public static void main(String[] args)
        throws IOException
    {
        String text
            = "Welcome to Anudip\nHappy Learning!";
 
        Path fileName = Path.of(
            "/Users/mayanksolanki/Desktop/demo.docx");
 
        Files.writeString(fileName, text);
 
        String file_content = Files.readString(fileName);
 
        System.out.println(file_content);
    }
}