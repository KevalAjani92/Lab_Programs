public class B_93 {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
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
        insertionSort(arr);
        System.out.println("Output : ");
        printArr(arr);
    }
}
