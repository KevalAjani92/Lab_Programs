import java.util.Scanner;
class ComplexNumber{
    int rr,ii;
    ComplexNumber(){
        rr=0;
        ii=0;
    }
    ComplexNumber(int rr,int ii){
        this.ii=ii;
        this.rr=rr;
    }
    void addition(ComplexNumber c1,ComplexNumber c2){
        this.rr=c1.rr+c2.rr;
        this.ii=c1.ii+c2.ii;
    }
}
public class ComplexNumberDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real and imagenary part Of 1st Complex Number:");
        int rr=sc.nextInt();
        int ii=sc.nextInt();
        ComplexNumber c1=new ComplexNumber(rr,ii);
        System.out.print("Enter real and imagenary part Of 2nd Complex Number:");
        int rr1=sc.nextInt();
        int ii1=sc.nextInt();
        ComplexNumber c2=new ComplexNumber(rr1, ii1);
        ComplexNumber c3=new ComplexNumber();
        c3.addition(c1, c2);
        System.out.println("Addition Of Complex Number:"+c3.rr+"+"+c3.ii+"i");
        sc.close();
    }
}
