import java.util.Scanner;

class Student_Detail{
    long enrollment_No;
    String name;
    int semester;
    float cpi;
    Scanner sc=new Scanner(System.in);

    Student_Detail[] sd=new Student_Detail[2];
    void setData(){
        for (int i = 0; i < sd.length; i++) {
            System.out.println("\nEnter Student "+(i+1)+"\'s Details \n");
            sd[i]=new Student_Detail();
            System.out.print("Enter Student "+(i+1)+"\'s Enrollment No. :");
            sd[i].enrollment_No=sc.nextLong();
            System.out.print("Enter Student "+(i+1)+"\'s Name :");
            sd[i].name=sc.nextLine();
            sd[i].name=sc.nextLine();
            System.out.print("Enter Student "+(i+1)+"\'s Semester No. :");
            sd[i].semester=sc.nextInt();
            System.out.print("Enter Student "+(i+1)+"\'s CPI :");
            sd[i].cpi=sc.nextFloat();
        }
    }
    void getData(){    
        for (int i = 0; i < sd.length; i++) {
            System.out.println("\nStudent "+(i+1)+"\'s Details \n");
            System.out.println("Student "+(i+1)+" \'s Enrollment No. :"+sd[i].enrollment_No);
            System.out.println("Student "+(i+1)+" \'s Name :"+sd[i].name);
            System.out.println("Student "+(i+1)+" \'s Semester No. :"+sd[i].semester);
            System.out.println("Student "+(i+1)+" \'s CPI :"+sd[i].cpi);
        }
    }
}
public class A_35 {
    public static void main(String[] args) {
        Student_Detail sd=new Student_Detail();
        sd.setData();
        sd.getData();
    }
}
