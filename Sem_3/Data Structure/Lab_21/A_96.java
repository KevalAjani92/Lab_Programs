public class A_96 {
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        if (i > mid) {
            while (j <= ei) {
                temp[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
        }
        // for (k = 0, i = si; k < temp.length; k++, i++) {
        // arr[i] = temp[k];
        // }
        for (k = 0; k < temp.length; k++) {
            arr[si+k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 42, 23, 74, 11, 65, 58, 94, 36, 99, 87 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}