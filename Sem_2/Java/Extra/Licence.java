class Medical extends Thread{
    static Medical md;
    public void run(){
        try{
            System.out.println("Medical Starts");
            Thread.sleep(1000);
            System.out.println("Medica Completed");
            Thread.sleep(500);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class TestDrive extends Thread{
    static TestDrive td;
    public void run(){
        try{
            Medical.md.join();
            System.out.println("TestDrive Starts");
            Thread.sleep(1000);
            System.out.println("TestDriveCompleted");
            Thread.sleep(500);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class OfficeWork extends Thread{
    static OfficeWork ow;
    public void run(){
        try{
            TestDrive.td.join();
            System.out.println("OfficeWork Starts");
            Thread.sleep(1000);
            System.out.println("OfficeWork Completed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class Licence {
    public static void main(String[] args) {
        Medical.md=new Medical();
        Medical.md.start();

        TestDrive.td=new TestDrive();
        TestDrive.td.start();

        OfficeWork.ow=new OfficeWork();
        OfficeWork.ow.start();
    }
}
