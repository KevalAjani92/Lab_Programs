import Data_Structure.*;
public class Extra {
    public static void main(String[] args) {
        StackImpl si=new StackImpl(5);
        si.push(5);
        si.push(2);
        si.push(3);
        si.push(4);
        si.push(8);

        // si.change(9, 2);
        si.display();
    }
}