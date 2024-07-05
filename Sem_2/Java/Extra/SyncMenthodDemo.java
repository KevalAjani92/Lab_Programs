class SyncMenthod{
    int total_seats=10;
    synchronized void bookSeat(int seats){
        if(seats<=total_seats){
            System.out.println(seats+" Seats Booked Successfully");
            total_seats-=seats;
            System.err.println("Seats Left:"+total_seats);
        }else{
            System.out.println(seats+"Seats Can't be Booked");
            System.err.println("Seats Left:"+total_seats);
        }
    }
}
public class SyncMenthodDemo extends Thread{
    static SyncMenthod s1;
    int seats;
    public void run(){
        s1.bookSeat(seats);
    }
    public static void main(String[] args) {
        s1=new SyncMenthod();
        
        SyncMenthodDemo s2=new SyncMenthodDemo();
        s2.seats=4;
        s2.start();
        
        SyncMenthodDemo s3=new SyncMenthodDemo();
        s3.seats=3;
        s3.start();

    }
}
