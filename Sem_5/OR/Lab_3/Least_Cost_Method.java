public class Least_Cost_Method {
    static int[] demand = {60,70,50,40,80};
    static int[] supply = {80,90,70,60};
    public static void main(String[] args) {
        int[][] costArr = {
            {2,7,3,3,6},
            {5,4,6,2,7},
            {6,8,5,9,3},
            {4,6,7,5,8}
        };
        
        // Check Demand = Supply
        if(!checkEquality(demand, supply)){
            System.out.println("Demand And Supply are not Equal");
            return;
        }
        int[][] ans = new int[costArr.length][costArr[0].length];
        int row = 0,col = 0;
        while(sumArr(supply) != 0 && sumArr(demand) != 0){
            int[][] tempArr = new int[ans.length][ans[0].length];
            for (int i = 0; i < tempArr.length; i++) {
                if(supply[i]==0){
                    continue;
                }
                for (int j = 0; j < tempArr[0].length; j++) {
                    if(demand[j] == 0){
                        continue;
                    }
                    tempArr[i][j] = costArr[i][j];
                }
            }
            int[] indexs = findMinIndexs(tempArr);
            row = indexs[0];
            col = indexs[1];
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
        }
        print2DArr(ans);
        int cost = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if(ans[i][j] != 0){
                    cost += ans[i][j]*costArr[i][j];
                }
            }
        }
        System.out.println("Optimal Cost(Using Least Cost Method) = "+cost);
    }

    public static void print1DArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void print2DArr(int[][] arr){
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
        s1 = sumArr(d);
        s2 = sumArr(s);
        return s1==s2;
    }
    public static int[] findMinIndexs(int[][] arr){
        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]<min && arr[i][j] > 0){
                    min = arr[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        int minCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == min){
                    minCount++;
                }
            }
        }
        if(minCount > 1){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j] == min && i!=ans[0] && j!=ans[1]){
                        int cuurentDiff = Math.abs(supply[i]-demand[j]);
                        int minDiff = Math.abs(supply[ans[0]]-demand[ans[1]]);
                        if(cuurentDiff < minDiff){
                            min = arr[i][j];
                            ans[0] = i;
                            ans[1] = j;
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
