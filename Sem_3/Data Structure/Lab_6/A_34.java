import java.util.Scanner;

class Employee_Detail{
    Scanner sc=new Scanner(System.in);
    int employee_ID;
    String name;
    String designation;
    int salary;

    void setData(){
        System.out.print("Enter Employee ID : ");
        this.employee_ID=sc.nextInt();
        System.out.print("Enter Employee Name : ");
        this.name=sc.nextLine();
        this.name=sc.nextLine();
        System.out.print("Enter Employee Designation : ");
        this.designation=sc.nextLine();
        System.out.print("Enter Employee Salary : ");
        this.salary=sc.nextInt();
    }
    void getData(){
        System.out.println("Employee ID : "+this.employee_ID);
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Designation : "+this.designation);
        System.out.println("Employee Salary : "+this.salary);
    }
}
public class A_34 {
    public static void main(String[] args) {
        
        Employee_Detail ed=new Employee_Detail();
        
        ed.setData();
        ed.getData();
    }
}
