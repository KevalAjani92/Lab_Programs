public class Wrapper1 {
    public static void main(String[] args) {
        int x=Integer.parseInt("123");
        System.out.println(x);

        Integer x1=Integer.valueOf("9206");
        int y=x1.intValue();
        System.out.println(y);

        Integer y1=Integer.valueOf("101", 2);
        int z=y1.intValue();
        System.out.println(z);
    }
}
