class Multiplication{
    public void repetativeMultiplication(int x,int y){
        int multiple=1;
            for(int i=1;i<=y;i++){
                multiple*=x;
            }
            System.out.println(x+"^"+y+" = "+multiple);
    }
}
public class A_1 {
    public static void main(String[] args) {
        try{
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);

            Multiplication m1=new Multiplication();
            m1.repetativeMultiplication(x, y);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Program End");
    }
}