import java.util.Scanner;
import java.util.Stack;

public class Prefix {
    public static int evalPre(StringBuffer prefix) {
        Stack<Integer> stk = new Stack<>();
        int value = 0;

        for (int i = 0; i < prefix.length(); i++) {
            char temp = prefix.charAt(i);
            if(temp==','){
                continue;
            }
            if (Character.isDigit(temp)) {
                String digit = "";
                while (temp != ',') {
                    digit = temp+digit;
                    i++;
                    temp = prefix.charAt(i);
                }
                stk.push(Integer.parseInt(String.valueOf(digit)));
                continue;
            } else {
                int op1 = stk.pop();
                int op2 = stk.pop();

                switch (temp) {
                    case '+':
                        value = op1 + op2;
                        break;
                    case '-':
                        value = op1 - op2;
                        break;
                    case '*':
                        value = op1 * op2;
                        break;
                    case '/':
                        value = op1 / op2;
                        break;
                    case '^':
                        value = (int) Math.pow(op1, op2);
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prefix String(comma Separated) : ");
        StringBuffer prefix = new StringBuffer(sc.nextLine());

        System.out.println(evalPre(prefix.reverse()));
    }
}
