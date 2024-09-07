public class A_98 {

    public static void heapSort(int arr[]) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void buildMaxHeap(int arr[]) {
        for (int i = ((arr.length - 1) / 2) - 1; i >= 0; i--) {
            heapify(arr, arr.length - 1, i);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int maxIndex = i;
        int leftChild = 2 * i + 1, rightChild = 2 * i + 2;
        if (leftChild < n && arr[leftChild] > arr[maxIndex]) {
            maxIndex = leftChild;
        }
        if (rightChild < n && arr[rightChild] > arr[maxIndex]) {
            maxIndex = rightChild;
        }
        if (i != maxIndex) {
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            heapify(arr, n, maxIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 42, 23, 74, 11, 65, 58, 94, 36, 99, 87 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}