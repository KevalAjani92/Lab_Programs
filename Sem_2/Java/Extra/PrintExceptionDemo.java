public class PrintExceptionDemo {
    public static void main(String[] args) {
        int a=100,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Stack Trace:");
            e.printStackTrace();
            System.out.println("\nto String");
            System.out.println(e.toString()+"\n");
            System.out.println("Get Message");
            System.out.println(e.getMessage()+"\n");
        }
        System.out.println("After Catch");
    }
}
