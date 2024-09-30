public class A_92 {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            printArr(arr);
            if(!(swapped)){
                break;
            }
        }
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr = { 3, 1, 9, 4, 5, 2 };
        int[] arr = {45,20,25,10,5,60,65,32,89,11};
        bubbleSort(arr);
        System.out.print("Output : ");
        printArr(arr);
    }
}