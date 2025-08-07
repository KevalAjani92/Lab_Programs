import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentMethod {
    public static void main(String[] args) {
        int[][] costArr ={
            {2,9,2,7,1},
            {6,8,7,6,1},
            {4,6,5,3,1},
            {4,2,7,3,1},
            {5,3,9,5,1}
        };
        int[][] allocations = new int[costArr.length][costArr[0].length];
        for (int i = 0; i < allocations.length; i++) {
            for (int j = 0; j < allocations[0].length; j++) {
                allocations[i][j] = costArr[i][j];
            }
        }
        //do row-col reduction
        performReduction(allocations);

        //do assignment
        performAssignment(allocations);
        print2DArr(allocations);

        //calculate cost
        int minCost = 0;
        for (int i = 0; i < allocations.length; i++) {
            for (int j = 0; j < allocations[0].length; j++) {
                if(allocations[i][j] == -1){
                    minCost += costArr[i][j];
                }
            }
        }
        // System.out.println("Minimum Cost = "+minCost);

    }
    public static void performReduction(int[][] arr){
        //row-reduction
        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            if(min == Integer.MAX_VALUE){
                continue;
            }
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] -= min;
            }
        }
        // print2DArr(arr);
        //col-reduction
        for(int i=0;i<arr[0].length;i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] < min){
                    min = arr[j][i];
                }
            }
            if(min == Integer.MAX_VALUE){
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] -= min;
            }
        }
        print2DArr(arr);
    }
    public static void performAssignment(int[][] arr){
        //row-assignment
        // List<Integer> assignedRow = new ArrayList<>();
        Set<Integer> assignedRow = new HashSet<>();
        Set<Integer> assignedCol = new HashSet<>();
        ArrayList<int[]> assigned = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int countZero = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) countZero++;
            }
            if(countZero > 1) continue;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] = -1;
                    crossOutZero(arr, i, j);
                    assigned.add(new int[]{i,j});
                    assignedRow.add(i);
                    assignedCol.add(j);
                }
            }
        }
        
        //col-asignment
        for(int i = 0;i<arr[0].length;i++){
            int countZero = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == 0) countZero++;
            }
            if(countZero > 1) continue;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == 0){
                    arr[j][i] = -1;
                    crossOutZero(arr,j,i);
                    assigned.add(new int[]{j,i});
                    assignedRow.add(j);
                    assignedCol.add(i);
                }
            }
        }
        // System.out.println(assignedRow);
        // System.out.println(assignedCol);

        // while (assigned.size() != arr.length) {
            
        // }
    }
    public static void crossOutZero(int[][] arr,int i,int j){
        for(int x = 0; x < arr[0].length ; x++){
            if(arr[i][x] == 0){
                arr[i][x] = -2;
            }
        }
        for(int x = 0; x < arr.length ; x++){
            if(arr[x][j] == 0){
                arr[x][j] = -2;
            }
        }
    }
    public static void revisedMatrix(int[][] arr,ArrayList<int[]> assigned){
        
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
                System.out.print(String.format("%02d", arr[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("==============");
    }
}