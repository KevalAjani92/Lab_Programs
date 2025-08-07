public class TaskDistribute {
    public static void main(String[] args) {
        int[] time = {10,20,35};
        
        int minLoad = Integer.MAX_VALUE;
        for (int i = 0; i <8 ; i++) {
            int[] ans = getBinary(i,time.length);
            // printArr(ans);
            int s1 = 0,s2=0;
            int k = 0;
            for (int j = 0; j < 3; j++) {
                if(ans[j] == 0){
                    s1+= time[k++];
                }else{
                    s2+=time[k++];
                }
            }
            int max = Math.max(s1, s2);
            minLoad = Math.min(minLoad, max);
        }
        System.out.println(minLoad);
    }
    public static int[] getBinary(int n,int length){
        int[] ans = new int[length];
        int temp = n,i=length-1;
        while (temp>0 && i>=0) {
            int temp1 = temp%2;
            ans[i] = temp1;
            i--;
            temp/=2;
        }
        return ans;
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
