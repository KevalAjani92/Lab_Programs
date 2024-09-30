public class BinaryToDecimalDemo {

    public static int binaryToDec(int n){
        int pow=0;
        int decNum=0;
        while(n>0){
            decNum+=(n%10)*Math.pow(2, pow);
            n/=10;
            pow++;
            
        }
        return decNum;
    }
    public static void main(String[] args) {
        System.out.println(BinaryToDecimalDemo.binaryToDec(1010));
    }
}