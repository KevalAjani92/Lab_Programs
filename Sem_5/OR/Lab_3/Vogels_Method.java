import java.util.ArrayList;
import java.util.List;

public class Vogels_Method {
    static int[] demand = {250,350,400,200};
    static int[] supply = {300,400,500};
    public static void main(String[] args) {
        int[][] costArr = {
            {3, 1, 7, 4},
            {2, 6, 5, 9},
            {8, 3, 3, 2}
        };

        // Check Demand = Supply
        if(!checkEquality(demand, supply)){
            System.out.println("Demand And Supply are not Equal");
            return;
        }
        int[][] ans = new int[costArr.length][costArr[0].length];
        int row = 0,col = 0;

        while (sumArr(supply) != 0 && sumArr(demand) != 0) {
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
            int[] indexs = findIndexs(tempArr);
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
            // System.out.println("==============");
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
        System.out.println("Optimal Cost(Using Vogel's Approximation Method) = "+cost);
    }

    public static int[] findIndexs(int[][] arr){
        int[] indexs = new int[2];
        int[] rowPenalty = new int[arr.length];
        int[] colPenalty = new int[arr[0].length];

        //rowPenalty
        for (int i = 0; i < rowPenalty.length; i++) {
            if(supply[i] == 0){
                continue;
            }
            rowPenalty[i] = findPenalty(arr[i]);
        }

        //colPenalty
        for (int i = 0; i < colPenalty.length; i++) {
            if(demand[i] == 0){
                continue;
            }
            int[] tempColArr = new int[arr.length];
            for(int j=0;j<arr.length;j++){
                tempColArr[j] = arr[j][i];
            }
            // print1DArr(tempColArr);
            // System.out.print("======");
            colPenalty[i] = findPenalty(tempColArr);
        }
        // print1DArr(colPenalty);
        // print1DArr(rowPenalty);
        // System.out.println("===============");

        List<Integer> rowMaxPenalties = new ArrayList<>();
        List<Integer> colMaxPenalties = new ArrayList<>();
        int maxPenalty = -1;

        for (int i = 0; i < rowPenalty.length; i++) {
            if(supply[i] != 0){
                if (rowPenalty[i] > maxPenalty) {
                    rowMaxPenalties.clear();
                    rowMaxPenalties.add(i);
                    maxPenalty = rowPenalty[i];
                } else if (rowPenalty[i] == maxPenalty) {
                    rowMaxPenalties.add(i);
                }
            }
        }

        for (int i = 0; i < colPenalty.length; i++) {
            if(demand[i] != 0){
                if (colPenalty[i] > maxPenalty) {
                    colMaxPenalties.clear();
                    rowMaxPenalties.clear(); // Clear row if higher column penalty found
                    colMaxPenalties.add(i);
                    maxPenalty = colPenalty[i];
                } else if (colPenalty[i] == maxPenalty) {
                    colMaxPenalties.add(i);
                }
            }
        }

        // System.out.println(rowMaxPenalties);
        // System.out.println(colMaxPenalties);

        int minCost = Integer.MAX_VALUE;
        int minRow = -1, minCol = -1;
        boolean isRow = true;

        for (int i : rowMaxPenalties) {
            for(int j=0;j<colPenalty.length;j++){
                if(demand[j] !=0 && arr[i][j] < minCost){
                    minCost = arr[i][j];
                    minRow = i;
                    minCol = j;
                    isRow = true;
                }
            }
        }

        for(int i : colMaxPenalties){
            for(int j=0;j<rowPenalty.length;j++){
                if(supply[j] != 0 && arr[j][i] < minCost){
                    minCost = arr[j][i];
                    minRow = j;
                    minCol = i;
                    isRow = false;
                }
            }
        }
        indexs[0] = minRow;
        indexs[1] = minCol;
        // System.out.println(minCost);
        if(rowMaxPenalties.size() !=0 && colMaxPenalties.size() !=0){
            int finalRow = -1, finalCol = -1;
            int maxAlloc = -1;

            for (int i = 0; i < arr.length; i++) {
                if(supply[i] == 0)
                    continue;
                for (int j = 0; j < arr[0].length; j++) {
                    if(demand[j] == 0)
                        continue;
                    if(arr[i][j] == minCost){
                        int allocation = Math.min(supply[i],demand[j]);
                        if(allocation > maxAlloc){
                            maxAlloc = allocation;
                            finalRow = i;
                            finalCol = j;
                        }
                    }    
                }
            }
            indexs[0] = finalRow;
            indexs[1] = finalCol;
        }
        

        // print1DArr(indexs);
        // System.out.println("=========");
        return indexs;
    }

    public static int findPenalty(int[] arr){
        // print1DArr(arr); 
        int minIndex = -1;
        int secondMinIndex = -1;
        int zeroCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0){
                zeroCnt++;
                continue;
            }
            if ((minIndex == -1 || arr[i] <= arr[minIndex])) {
                secondMinIndex = minIndex;
                minIndex = i;
            } else if (arr[i] != arr[minIndex]) {
                if (secondMinIndex == -1 || arr[i] < arr[secondMinIndex]) {
                    secondMinIndex = i;
                }
            }
        }
        // System.out.println("Min = "+minIndex);
        // System.out.println("SecondMin = "+secondMinIndex);
        if(zeroCnt == arr.length-1){
            int temp = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0){
                    temp = arr[i];
                }
            }
            return temp;
        }
        
        return Math.abs(arr[minIndex] - arr[secondMinIndex]);
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
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
// class ElementIndex{
//     int i;
//     int j;
//     public ElementIndex(int i,int j){
//         this.i = i;
//         this.j = j;
//     }
// }