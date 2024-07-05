class Area{
	static void fun1(){
		System.out.println("Area 1");
	}
	
}
class Example{
	int x;	 
	void fun1(){
		System.out.println("fun1");
	}
}
public class Object1 {
    static void fun1(){
		System.out.println("B");
	}
public static void main(String[] args) {
	System.out.println("A");      
	Area.fun1();  //Static function of area class

	Example e1=new Example();  //Creating Object Of Example Class
	e1.fun1();
	e1.x=3;
	System.out.println(e1.x);
}
}
