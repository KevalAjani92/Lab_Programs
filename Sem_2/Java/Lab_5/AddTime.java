import java.util.Scanner;
class Time{
    int hh;
    int mm;
    Time(){

    }
    Time(int hh,int mm){
        this.hh=hh;
        this.mm=mm;
    }
    void AdditionOfTime(Time ob){
        this.hh+=ob.hh;
        this.mm+=ob.mm;
        while(this.mm>=60){
            this.hh++;
            this.mm-=60;
        }
    }
}

public class AddTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Hour1:");
        int hh1=sc.nextInt();
        System.out.print("Enter Minutes1:");
        int mm1=sc.nextInt();
        while (mm1>=60 || mm1<=0) {
            System.out.print("Enter Minutes Less Than 60:");
            mm1=sc.nextInt();
        }
        System.out.print("Enter Hour2:");
        int hh2=sc.nextInt();
        System.out.print("Enter Minutes2:");
        int mm2=sc.nextInt();
        while (mm2>=60 || mm2<=0) {
            System.out.print("Enter Minutes Less Than 60:");
            mm2=sc.nextInt();
        }
        Time t1=new Time(hh1, mm1);
        Time t2=new Time(hh2, mm2);
        t1.AdditionOfTime(t2);
        System.out.println("Addition Of Time(hh:mm)="+t1.hh+":"+t1.mm);
        sc.close();
    }
}
