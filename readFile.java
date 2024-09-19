import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readFile {
    public static void main(String[] args) {
        try{
            File sc = new File("note.txt");
            System.out.println(sc.canWrite());
            System.out.println(sc.canRead());
        }

        catch(Exception e){System.out.println(e.getMessage());}
    }
}
