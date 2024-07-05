class Keval{
    public void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
public class ThreadDemo{
    public static void main(String[] args) {    
        Keval k1=new Keval();
        k1.printDecreasing(5);  
    }
}
