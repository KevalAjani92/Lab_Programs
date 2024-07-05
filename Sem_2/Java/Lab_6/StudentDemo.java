import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;
    int grade_point;

    Student(int id_no,int no_of_subjects_registered){
        this.id_no=id_no;
        this.no_of_subjects_registered=no_of_subjects_registered;
        subject_code= new int[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained= new String[no_of_subjects_registered];
    }
    double calculateSpi(){
        int sum=0;
        int creditSum=0;
        for(int i=0;i<this.no_of_subjects_registered;i++){
            switch (grade_obtained[i]) {
                case "A++":
                    grade_point=10;
                    break;
                case "A+":
                    grade_point=9; 
                    break;   
                case "A":
                    grade_point=8; 
                    break;   
                case "B+":
                    grade_point=7; 
                    break;   
                case "B":
                    grade_point=6; 
                    break;   
                case "C":
                    grade_point=5; 
                    break;
                case "P":
                    grade_point=4; 
                    break;
                default:
                    grade_point=0;
                    break;
            }
            sum+=subject_credits[i]*grade_point;
            creditSum+=subject_credits[i];
        }
        return (double)sum/creditSum;
    }
}
public class StudentDemo{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        Scanner sc=new Scanner(System.in);
        Student[] s = new Student[n];
        int id;
        int sub;
        System.out.println("Grade System\n\n A++ ->10 ,A+ ->9 ,A->8 ,B+ ->7 ,B ->6 ,C ->5 ,P ->4 ,F/Ab ->0");
        for(int i=0;i<n;i++){
            System.out.println("Enter Detail For Student "+(i+1)+"\n");
            System.out.print("Enter Id:");
            id=sc.nextInt();
            System.out.print("Enter Number Of Subjects:");
            sub=sc.nextInt();
            s[i]=new Student(id, sub);

            for(int j=0;j<sub;j++){
                System.out.print("\nEnter Code Of Subject "+(j+1)+" :");
                s[i].subject_code[j]=sc.nextInt();
                System.out.print("Enter Credit Of Subject "+(j+1)+" :");
                s[i].subject_credits[j]=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Obtained Grade Of Subject "+(j+1)+" :");
                s[i].grade_obtained[j]=sc.nextLine();
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            double spi=s[i].calculateSpi();
            System.out.println("Student "+(i+1)+" Get "+spi+" Spi In Exam");
        }
    }
}