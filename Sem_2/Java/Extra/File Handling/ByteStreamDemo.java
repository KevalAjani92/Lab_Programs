import java.io.*;
public class ByteStreamDemo {
    public static void main(String[] args) {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1){
               out.write(c); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(in!=null) in.close();
                if(out!=null) out.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}