class NegativeNumberExcepction extends Exception{
    public NegativeNumberExcepction(String str){
        super(str);
    }
}
class EvenlyDivisibleBy10 extends Exception{
    public EvenlyDivisibleBy10(String str){
        super(str);
    }
}
class NumberIsGreater extends Exception{
    public NumberIsGreater(String str){
        super(str);
    }
}
public class B_2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<args.length;i++){
            try{
                if(Integer.parseInt(args[i])<0){
                    throw new NegativeNumberExcepction("Entered Number Is Negative");
                }
                if(Integer.parseInt(args[i])%10==0){
                    throw new EvenlyDivisibleBy10("Entered Number Is Evenly Divisible By 10");
                }
                if((Integer.parseInt(args[i])>1000 && Integer.parseInt(args[i])<2000) || Integer.parseInt(args[i])>7000){
                    throw new NumberIsGreater("Number Is Greater");
                }
            sum+=Integer.parseInt(args[i]);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Total Sum = "+sum);
        }
    }
}
