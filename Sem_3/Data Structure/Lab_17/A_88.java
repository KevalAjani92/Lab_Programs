public class A_88 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int max = 999999;
        int min = 100000;
        for (int i = 1; i <= 15; i++) {
            int random = (int)(Math.random() * (max - min + 1)) + min;
            int key = (random % 18)+2;
            if(arr[key] == 0){
                arr[key] = random;
            }else{
                int temp = key;
                while (arr[temp] != 0) {
                    temp = (temp+1)%20;
                }
                arr[temp] = random;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}