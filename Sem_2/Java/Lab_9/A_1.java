class GM implements Runnable{
    public void run(){
        while(true){
            System.out.println("Goog Morning");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class GN implements Runnable{
    public void run(){
        while(true){
            System.out.println("Goog Night");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class A_1 {
    public static void main(String[] args) {
        GM g1=new GM();
        GN g2=new GN();
        Thread t1=new Thread(g1);
        Thread t2=new Thread(g2);
        t1.start();
        t2.start();
    }
}