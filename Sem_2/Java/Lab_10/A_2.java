import java.io.*;
import java.util.Scanner;

public class A_2 {
    public static void main(String[] args) {
        int nums=0;
        try{
            FileWriter f2=new FileWriter("file2.txt");
            File f1=new File("abc.txt");
            Scanner sc=new Scanner(f1);

            while (sc.hasNextLine()) {
                String[] str=sc.nextLine().split(" ");
                for(int i=0;i<str.length;i++){
                    if(str[i].equals("word1")){
                    nums++;
                    f2.write("word2 ");
                    }else{
                        f2.write(str[i]+" ");
                    }
                }
                f2.write("\n");
            }
            sc.close();
            f2.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Number Of Replacement = "+nums);
    }
}
