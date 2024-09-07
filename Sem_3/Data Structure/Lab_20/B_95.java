public class B_95 {
    public static int getMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int temp : arr) {
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void radixSortArr(int arr[]) {
        int m = getMax(arr);
        for (int place = 1; m / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }

    public static void countingSort(int arr[], int place) {
        int[] count = new int[10];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i <= 9; i++) {
            count[i] += count[i - 1];
        }
        for (int i = output.length-1; i >= 0; i--) {
            output[count[((arr[i] / place) % 10)] - 1] = arr[i];
            count[((arr[i] / place) % 10)]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        radixSortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
