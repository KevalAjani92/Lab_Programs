public class B_99 {

    public static void shellSort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (arr[i + gap] > arr[i])
                        break;
                    else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 42, 23, 74, 11, 65, 58, 94, 36, 99, 87 };
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
