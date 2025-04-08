
import static java.lang.System.out;
import java.util.*;

class removeArrDup {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9};
        int k = removeDuplicates(a);
        out.println(Arrays.toString(Arrays.copyOf(a, k)));
    }
}
