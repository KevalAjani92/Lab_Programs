public class DecToBin {

    public static int DecimalToBinary(int n){
        int pow=0;
        int binNum=0;
        while(n>0){
            binNum+=(n%2)*Math.pow(10, pow);
            pow++;
            n/=2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        System.out.println(DecToBin.DecimalToBinary(6));
    }
}
