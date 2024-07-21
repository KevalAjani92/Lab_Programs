import java.util.Scanner;
import java.util.Stack;

public class B_48 {
    public static int evalPre(String prefix){
        Stack<Integer> stk= new Stack<>();
        int value=0;
        char temp;
        for (int i = prefix.length()-1; i >= 0; i--) {
            temp=prefix.charAt(i);
            if(Character.isDigit(temp)){
                stk.push(temp-'0');
            }else{
                int op1=stk.pop();
                int op2=stk.pop();

                switch (temp) {
                    case '+':
                        value=op1+op2;
                        break;
                    case '-':
                        value=op1-op2;
                        break;
                    case '*':
                        value=op1*op2;
                        break;
                    case '/':
                        value=op1/op2;
                        break;
                    case '^':
                        value=(int) (Math.pow(op1, op2));
                        break;
                
                    default:
                        break;
                }
            stk.push(value);
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Prefix String : ");
        String prefix=sc.nextLine();

        System.out.println(evalPre(prefix));

        sc.close();
    }
}
