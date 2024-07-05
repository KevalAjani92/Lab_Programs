import java.util.Scanner;
class Member{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    long phoneNumber;
    String address;
    int salary;

    void printSalary(){
        System.out.println(name+" have Salary Of Rs."+salary);
    }
    Member(String str){
        System.out.println("\nEnter Details Of "+str+"\n");
        System.out.print("Enter Name:");
        this.name=sc.nextLine();
        System.out.print("Enter Age:");
        this.age=sc.nextInt();
        System.out.print("Enter PhoneNumber:");
        this.phoneNumber=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Address:");
        this.address=sc.nextLine();
        System.out.print("Enter Salary:");
        this.salary=sc.nextInt();
        sc.nextLine();
    }
    void printDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("PhoneNumber:"+this.phoneNumber);
        System.out.println("Address:"+this.address);
        printSalary();
    }
}
class Employee extends Member{
    String specialization;
    Employee(String str){
        super(str);
        System.out.print("Enter Specialization:");
        this.specialization=sc.nextLine();
    }
    void printDetails(){
        System.out.println("\nDetails Of Employee\n");
        super.printDetails();
        System.out.println("Specialization:"+this.specialization);
    }
}
class Manager extends Member{
    String Department;
    Manager(String str){
        super(str);
        System.out.print("Enter Department:");
        this.Department=sc.nextLine();
    }
    void printDetails(){
        System.out.println("\nDetails Of Manager\n");
        super.printDetails();
        System.out.println("Specialization:"+this.Department);
    }
}
public class MemberDemo {
    public static void main(String[] args) {
        Employee e1=new Employee("Employee");
        e1.printDetails();
        Manager m1=new Manager("Manager");
        m1.printDetails();
    }
}
