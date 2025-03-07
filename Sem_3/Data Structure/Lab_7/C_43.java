import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Interval{
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class C_43 {
    public static void mergeIntervals(Interval arr[]) {
        if (arr.length <= 0)
            return;

        Stack<Interval> stack = new Stack<>();

        // sort the intervals in increasing order of start
        // time
        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval top = stack.peek();

            // if current interval is not overlapping with
            // stack top, push it to the stack
            if (top.end < arr[i].start)
                stack.push(arr[i]);

            // Otherwise update the ending part of top if
            // ending of current interval is more
            else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        // Print contents of stack
        System.out.print("The Merged Intervals are: ");
        System.out.print("[");
        Interval first=stack.getFirst();
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.print("{" + t.start + "," + t.end
                    + "}");
            if(t!=first){
                System.out.print(" , ");
            }        
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 3);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(9, 10);
        mergeIntervals(arr);
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2,3});
        System.out.println(list);
    }
}