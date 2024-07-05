import java.io.*;
public class CharacterStreamDemo {
    public static void main(String[] args) {
        Reader fr=null;
        Writer fw=null;
        try{
            fr=new FileReader("input.txt");
            fw=new FileWriter("output.txt");
            
            int data=fr.read();
            while(data!=-1){
                fw.write(data);
                data=fr.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fr!=null) fr.close();
                if(fw!=null) fw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
