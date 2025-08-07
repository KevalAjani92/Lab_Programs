import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int assignment_count, assignee_count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of assignments : ");
        assignment_count = sc.nextInt();

        System.out.println("Enter no. of assignees : ");
        assignee_count = sc.nextInt();

        if (assignee_count > assignment_count) {
            System.out.println("Not enough assignments to assign all assignees to");
            sc.close();
            return;
        }

        if (assignee_count < assignment_count) {
            System.out.println("Not enough assignees to assign all assignments");
        }

        int[][] unit_cost = takeArray(assignee_count, assignment_count, sc);
        sc.close(); // ✅ Close scanner only once, here

        int[][] assignment_matrix = copyOf2D(unit_cost);
        ArrayList<int[]> assigned = makeAssignment(assignment_matrix);

        int cost = 0;
        for (int[] pos : assigned) {
            cost += unit_cost[pos[0]][pos[1]];
        }

        System.out.println("\nAssignments (Assignee → Assignment):");
        for (int[] pos : assigned) {
            System.out.println("Assignee " + pos[0] + " → Assignment " + pos[1]);
        }

        System.out.println("Minimum assignment cost : " + cost);
    }

    public static int[][] takeArray(int m, int n, Scanner sc) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter unit cost for Assignee " + i + " to Assignment " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return arr;
    }

    public static ArrayList<int[]> makeAssignment(int[][] arr) {
        // Row reduction
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < min) min = arr[i][j];
            }
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] -= min;
            }
        }

        // Column reduction
        for (int j = 0; j < arr[0].length; j++) {
            int min = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] < min) min = arr[i][j];
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] -= min;
            }
        }

        ArrayList<int[]> assigned = assignZeros(arr);
        while (assigned.size() != arr.length) {
            revisedMatrix(arr, assigned);
            assigned = assignZeros(arr); // Recalculate after matrix update
        }

        return assigned;
    }

    public static void revisedMatrix(int[][] arr, ArrayList<int[]> assigned) {
        boolean[] checkedRow = new boolean[arr.length];
        boolean[] checkedCol = new boolean[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[0].length; j++) {
                if (isAssigned(i, j, assigned)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                checkRow(arr, i, checkedRow, checkedCol, assigned);
            }
        }

        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (checkedRow[i] && !checkedCol[j]) {
                    if (min == -1 || arr[i][j] < min) {
                        min = arr[i][j];
                    }
                }
            }
        }

        if (min == -1) {
            System.out.println("Couldn't find valid assignments");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!checkedRow[i] && checkedCol[j]) {
                    arr[i][j] += min;
                } else if (checkedRow[i] && !checkedCol[j]) {
                    arr[i][j] -= min;
                }
            }
        }
    }

    public static void checkRow(int[][] arr, int row, boolean[] checkedRow, boolean[] checkedCol, ArrayList<int[]> assigned) {
        for (int j = 0; j < arr[0].length; j++) {
            if (!checkedCol[j] && arr[row][j] == 0) {
                checkedCol[j] = true;
                checkCol(arr, j, checkedRow, checkedCol, assigned);
            }
        }
    }

    public static void checkCol(int[][] arr, int col, boolean[] checkedRow, boolean[] checkedCol, ArrayList<int[]> assigned) {
        for (int i = 0; i < arr.length; i++) {
            if (!checkedRow[i] && arr[i][col] == 0 && isAssigned(i, col, assigned)) {
                checkedRow[i] = true;
                checkRow(arr, i, checkedRow, checkedCol, assigned);
            }
        }
    }

    public static ArrayList<int[]> assignZeros(int[][] arr) {
        ArrayList<int[]> assigned = new ArrayList<>();

        // Assign unique row zeros
        for (int i = 0; i < arr.length; i++) {
            int zeroInd = -1, count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (zeroInd == -1) zeroInd = j;
                }
            }
            if (count == 1 && !isCrossed(i, zeroInd, assigned)) {
                assigned.add(new int[]{i, zeroInd});
            }
        }

        // Assign unique column zeros
        for (int j = 0; j < arr[0].length; j++) {
            int zeroInd = -1, count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (zeroInd == -1) zeroInd = i;
                }
            }
            if (count == 1 && !isCrossed(zeroInd, j, assigned)) {
                assigned.add(new int[]{zeroInd, j});
            }
        }

        // Assign remaining zeros
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0 && !isCrossed(i, j, assigned)) {
                    assigned.add(new int[]{i, j});
                    break;
                }
            }
        }

        return assigned;
    }

    public static boolean isCrossed(int i, int j, ArrayList<int[]> list) {
        for (int[] temp : list) {
            if (temp[0] == i || temp[1] == j) return true;
        }
        return false;
    }

    public static boolean isAssigned(int i, int j, ArrayList<int[]> list) {
        for (int[] temp : list) {
            if (temp[0] == i && temp[1] == j) return true;
        }
        return false;
    }

    public static int[][] copyOf2D(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, copy[i], 0, arr[0].length);
        }
        return copy;
    }
}
