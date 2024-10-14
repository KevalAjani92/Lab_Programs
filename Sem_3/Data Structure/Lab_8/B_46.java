import java.util.Scanner;

public class B_46 {
    public static int G(char next) {
        if (next == '+' || next == '-') {
            return 1;
        } else if (next == '*' || next == '/') {
            return 3;
        } else if (next == '^') {
            return 6;
        } else if (next >= 'a'&& next<='z' || next >= '0' && next <= '9') {
            return 8;
        }else if(next=='('){
            return 0;
        }
        return -1;
    }
    public static int F(char next) {
        if (next == '+' || next == '-') {
            return 2;
        } else if (next == '*' || next == '/') {
            return 4;
        } else if (next == '^') {
            return 5;
        } else if (next >= 'a'&& next<='z' || next >= '0' && next <= '9') {
            return 7;
        }else if(next=='('){
            return 9;
        }else if(next==')'){
            return 0;
        }
        return -1;
    }
    public static int R(char next) {
        if (next == '+' || next == '-' || next == '*' || next == '/'||next == '^') {
            return -1;
        }else if (next >= 'a'&& next<='z' || next >= '0' && next <= '9') {
            return 1;
        }
        return 0;
    }
    public static int GS(char temp) {
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

    public static String getPrefixShortcut(String infix,StringBuffer prefix){
        Stack_Polish stk=new Stack_Polish(infix.length());
        stk.push('(');
        for (int i = 0; i < infix.length(); i++) {
            char next = infix.charAt(i);
            if (next >= 'a' && next <= 'z') {
                prefix.append(next);
            } else if (next == '+' || next == '-' || next == '*' || next == '/') {
                while (GS(stk.peep(1)) > GS(next)) {
                    prefix.append(stk.pop());
                }
                stk.push(next);
            } else if (next == '^') {
                while(GS(stk.peep(1)) >= GS(next)){
                            
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
        return prefix.reverse().toString();
    }
    
    public static String getPrefix(String infix,StringBuffer prefix){
        Stack_Polish stk = new Stack_Polish(infix.length());
        stk.push('(');
        int rank=0;
        for (int i = 0; i < infix.length(); i++) {
            char next=infix.charAt(i);
            if(stk.top<0){
                System.out.println("Invalid");
                return "null";
            }
            while (G(stk.peep(1))>F(next)) {
                char temp=stk.pop();
                prefix.append(temp);
                rank+=R(temp);

                if(rank<1){
                    System.out.println("Invalid");
                    return "null";
                }
            }
            if(G(stk.peep(1))!=F(next)){
                stk.push(next);
            }else{
                stk.pop();
            }
        }
        if(stk.top!=-1 || rank!=1){
            System.out.println("Invalid");
            return null;
        }else{
            return prefix.reverse().toString();
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
        StringBuffer prefix=new StringBuffer("");
        System.out.println("Prefix : "+getPrefix(infix, prefix));
        sc.close();
    }
}
