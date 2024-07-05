import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Throws{
    void readFile() throws FileNotFoundException{ //throws indicate caller method that given exception might occurs
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        Throws t1=new Throws();
        try{
            t1.readFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
