public class B_97 {
    public static void quickSortArr(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIndex = partition(arr, si, ei);

        quickSortArr(arr, si, pIndex - 1);
        quickSortArr(arr, pIndex + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[si];
        int i = ei + 1;
        for (int j = ei; j >= si; j--) {
            if (arr[j] > pivot) {
                i--;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i--;
        int temp = pivot;
        arr[si] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSortArr2(int arr[], int si, int ei) {
        if (si < ei) {
            boolean flag = true;
            int i = si;
            int j = ei + 1;
            int key = arr[si];
            while (flag) {
                i++;
                while (arr[i] < key) {
                    i++;
                }
                j--;
                while (arr[j] > key) {
                    j--;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    flag = false;
                }
            }
            int temp = arr[si];
            arr[si] = arr[j];
            arr[j] = temp;
            printArr(arr);
            quickSortArr(arr, si, j - 1);
            quickSortArr(arr, j + 1, ei);
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 45, 20, 25, 10, 5, 60, 65, 32, 89, 11 };
        quickSortArr2(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
