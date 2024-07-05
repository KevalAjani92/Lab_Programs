import java.io.*;

public class A_4 {
    public static void main(String[] args) {
        try{
            DataOutputStream dout=new DataOutputStream(new FileOutputStream("StudentData2.txt") );
            Student s1=new Student("Nikunj", 20);
            Student s2=new Student("Keval", 18);
            Student s3=new Student("Darshan", 15);
            Student s4=new Student("Aayush", 19);
            dout.writeUTF(s1.toString());
            dout.writeUTF(s2.toString());
            dout.writeUTF(s3.toString());
            dout.writeUTF(s4.toString());

            dout.close();
            System.out.println("Data Written Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            DataInputStream din=new DataInputStream(new FileInputStream("StudentData2.txt"));
            while(din.available()>0){
                System.out.println(din.readUTF());
            }
            din.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
