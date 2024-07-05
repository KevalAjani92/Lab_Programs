class Demo{
	 int x;
	 int y;
	void A(){
		
	}
	void B(){
		
	}
	Demo(int i,int j){
		x=i;
		y=j;
	}
}
public class ParaConstruc {
    public static void main(String[] args) {
        Demo d1=new Demo(5, 9);
        Demo d2=new Demo(9, 10);
        System.out.println("X:"+d1.x+",Y:"+d1.y);
        System.out.println("X:"+d2.x+"Y:"+d2.y);
    }
}
