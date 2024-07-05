class ArrayDatabase {

    private int[] data;

    public ArrayDatabase(int[] data) {
        this.data = data;
    }

    public int sum() {
        int total = 0;
        for (int value : data) {
            total += value;
        }
        return total;
    }

    public int min() {
        int minimum = Integer.MAX_VALUE;
        for (int value : data) {
            if (value < minimum) {
                minimum = value;
            }
        }
        return minimum;
    }

    public int max() {
        int maximum = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }

    public double avg() {
        if (data.length == 0) {
            return 0;
        }
        return (double) sum() / data.length;
    }
}
public class C_28{
    public static void main(String[] args) {
        int[] dataArray = {3, 5, 7, 2, 8};
        ArrayDatabase db = new ArrayDatabase(dataArray);

        System.out.println("Sum: " + db.sum());
        System.out.println("Min: " + db.min());
        System.out.println("Max: " + db.max());
        System.out.println("Avg: " + db.avg());
    }
}