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

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 45, 20, 25, 10, 5, 60, 65, 32, 89, 11 };
        shellSort(arr);
        System.out.println("Output : ");
        printArr(arr);
    }
}
