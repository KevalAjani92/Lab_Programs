class CountStasic{
    static int count=0;
    CountStasic(){
        count++;
    }
}
public class CountStasicDemo {
    public static void main(String[] args) {
        CountStasic c1=new CountStasic();
        CountStasic c2=new CountStasic();
        System.out.println("Number Of Object="+CountStasic.count);
    }
}
