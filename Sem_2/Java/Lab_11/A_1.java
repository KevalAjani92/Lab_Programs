import java.io.*;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name:"+name+","+"Age:"+age;
    }
}
public class A_1 {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("StudentData.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            Student s1=new Student("Darshan", 15);
            Student s2=new Student("Keval", 18);
            Student s3=new Student("Aayush", 19);
            Student s4=new Student("Nikunj", 20);
            bw.write(s1.toString()+"\n");
            bw.write(s2.toString()+"\n");
            bw.write(s3.toString()+"\n");
            bw.write(s4.toString()+"\n");

            bw.close();
            System.out.println("Data input sucessfully");
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            FileReader fr=new FileReader("StudentData.txt");
            BufferedReader br=new BufferedReader(fr);

            String s=br.readLine();
            while(s!=null){
                System.out.println(s);
                s=br.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}