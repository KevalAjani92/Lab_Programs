import java.io.*;
import java.util.*;
public class A_1 {
    public static void main(String[] args) {
        File f1=new File("abc.txt");
        int line=0,words=0;
        try{
            if(!f1.exists()){
                throw new FileNotFoundException("File Not Found");
            }
            String str="",str2="";
            Scanner sc=new Scanner(f1);

            while(sc.hasNextLine()){
                str+=sc.nextLine();
                line++;
            }
            sc=new Scanner(f1);
            while(sc.hasNext()){
                str2+=sc.next()+" ";
                words++;
            }
            sc.close();
            System.out.println("Lines ="+line);
            System.out.println("Char ="+(int)str.length());
            System.out.println("Words ="+words);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}