class ThreeDPoint extends MyPoint{
    double z;
    public double getZ(){
        return z;
    }
    ThreeDPoint(){
        super();
        this.z=0;
    }
    ThreeDPoint(double x,double y,double z){
        super(x, y);
        this.z=z;
    }
    public double distance(ThreeDPoint t){
        return Math.sqrt(Math.pow((t.getX()-x), 2)+
                         Math.pow(t.getY()-y, 2)+
                         Math.pow(t.getZ()-z, 2));
    }
}
public class ThreeDPointDemo {
    public static void main(String[] args) {
        ThreeDPoint t1=new ThreeDPoint(0,0,0);
        ThreeDPoint t2=new ThreeDPoint(10, 30, 25.5);
        double ans=t1.distance(t2);
        System.out.println("Distance="+ans);
    }
}