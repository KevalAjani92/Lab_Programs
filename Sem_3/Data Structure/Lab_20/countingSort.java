public class countingSort {
    public static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int temp : arr) {
            max = Math.max(max, temp);
        }
        return max;
    }
    public static void countingSortArr(int arr[]){
        int m = getMax(arr);
        int[] count = new int[m+1];
        int[] output = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i = 1;i<=m;i++){
            count[i] += count[i-1];
        }
        for (int i = output.length-1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, 9, 4, 5, 2 };
        countingSortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
