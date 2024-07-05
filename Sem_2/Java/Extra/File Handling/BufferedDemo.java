import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader("input.txt");
            fw=new FileWriter("output.txt");

            BufferedReader br=new BufferedReader(fr);
            BufferedWriter bw=new BufferedWriter(fw);

            String str=br.readLine();
            while(str!=null){
                bw.write(str);
                bw.write("\n");
                str=br.readLine();
            }
            bw.close();
            br.close();
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
