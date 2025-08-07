public class North_West {
    public static void main(String[] args) {
        int[][] costArr = {
            {12,10,12,13},
            {7,11,8,14},
            {6,16,11,7}
        };
        int[] demand = {180,150,350,320};
        int[] supply = {500,300,200};

        // Check Demand = Supply
        if(!checkEquality(demand, supply)){
            System.out.println("Demand And Supply are not Equal");
            return;
        }

        int[][] ans = new int[costArr.length][costArr[0].length];
        int col=0,row=0;
        while(col<ans[0].length && row<ans.length){
            if(demand[col]<=supply[row]){
                ans[row][col] = demand[col];
                int tempDemand = demand[col];
                demand[col] -= tempDemand;
                supply[row] -= tempDemand;
            }else{
                ans[row][col] = supply[row];
                int tempSupply = supply[row];
                demand[col] -= tempSupply;
                supply[row] -= tempSupply;
            }            
            if(demand[col] == 0){
                col++;
            }
            if(supply[row] == 0){
                row++;
            }
        }
        printArr(ans);
        int cost = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if(ans[i][j] != 0){
                    cost += ans[i][j]*costArr[i][j];
                }
            }
        }
        System.out.println("Optimal Cost(Using Nort-West Corner Method) = "+cost);
    }
    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(String.format("%03d", arr[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("==============");
    }
    public static boolean checkEquality(int[] d,int[] s){
        int s1 = 0,s2 = 0;
        for (int i = 0; i < d.length; i++) {
            s1+=d[i];
        }
        for (int i = 0; i < s.length; i++) {
            s2+=s[i];
        }
        return s1==s2;
    }
}