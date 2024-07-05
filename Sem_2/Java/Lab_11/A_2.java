import java.io.*;

public class A_2 {
    public static void main(String[] args) {
       File f=new File(args[0]);
       if(!f.exists()){
            System.out.println("Does Not Exist");
       }else{
            if(f.isFile()){
                System.out.println(f.length());
            }else{
                File[] files=f.listFiles();
                for(int i=0;i<files.length;i++){
                    System.out.println(files[i].getName());
                }
            }
       }
       
    }
}
