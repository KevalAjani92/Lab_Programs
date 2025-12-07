public class SaddlePoint{
    public static void main(String[] args){
        int[][] arr = {
            {-5,2,0},
            {5,6,4},
            {4,0,2}
        };
        int[] minOfRow = new int[arr.length];
        int[] maxOfCol = new int[arr[0].length];

        for(int i=0;i<arr.length;i++){
            minOfRow[i] = minOfArr(arr[i]);
        }
        for(int i=0;i<arr[0].length;i++){
            int temp[] = new int[arr.length];
            for(int j=0;j<arr.length;j++){
                temp[j] = arr[j][i];
            }
            maxOfCol[i] = maxOfArr(temp);
        }
        // printArr(minOfRow);
        // printArr(maxOfCol);
        int maximin = maxOfArr(minOfRow);
        int minimax = minOfArr(maxOfCol);
        System.out.println(maximin);
        System.out.println(minimax);

    }    
    public static int minOfArr(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxOfArr(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}