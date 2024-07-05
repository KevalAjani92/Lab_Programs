public class FinallyDemo {
    public static void main(String[] args) {
        int a=100,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally Block Executed");
        }
    }
}
