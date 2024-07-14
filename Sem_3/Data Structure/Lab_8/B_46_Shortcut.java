import java.util.Scanner;

public class B_46_Shortcut {
    public static int G(char temp) {
        switch (temp) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            case ')':
                return 0;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Infix Expression : ");
        String str = sc.nextLine().toLowerCase();

        String infix="";
        for(int i=str.length()-1;i>=0;i--){
            char temp=str.charAt(i);
            if(temp==')'){
                infix+='(';
            }else if(temp=='('){
                infix+=')';
            }else{
                infix+=temp;
            }
        }
        infix+=')';
        // System.out.println(infix);
        Stack_Polish stk=new Stack_Polish(infix.length());
        stk.push('(');
        StringBuffer prefix=new StringBuffer("");

        for (int i = 0; i < infix.length(); i++) {
            char next = infix.charAt(i);
            if (next >= 'a' && next <= 'z') {
                prefix.append(next);
            } else if (next == '+' || next == '-' || next == '*' || next == '/') {
                while (G(stk.peep(1)) > G(next)) {
                    prefix.append(stk.pop());
                }
                stk.push(next);
            } else if (next == '^') {
                while(G(stk.peep(1)) >= G(next)){
                            
                    prefix.append(stk.pop());
                }
                stk.push(next);
            } else if (next == '(') {
                stk.push(next);
            } else if (next == ')') {
                char temp2 = stk.pop();
                while (temp2 != '(') {
                    prefix.append(temp2);
                    temp2 = stk.pop();
                }
            }
        }
        System.out.println("Prefix : "+prefix.reverse());
    }
}
