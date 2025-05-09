import java.util.Arrays;

public class MergingSortedArrays {
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Use a for loop with a condition to simulate while-loop behavior
        for (; i < n && j < m; k++) {
            if (a[i] <= b[j]) {
                merged[k] = a[i++];
            } else {
                merged[k] = b[j++];
            }
        }

        // Copy remaining elements from a (if any)
        for (; i < n; i++, k++) {
            merged[k] = a[i];
        }

        // Copy remaining elements from b (if any)
        for (; j < m; j++, k++) {
            merged[k] = b[j];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] result = mergeSortedArrays(array1, array2);

        System.out.println(Arrays.toString(result));
    }

}
