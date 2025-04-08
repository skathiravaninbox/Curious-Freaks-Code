
import java.util.Arrays;

class LongComPrefix {

    public static String longestCommonPrefix(String arr[]) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int index = -1;
        for (int i = 0; i < Math.min(last.length(), first.length()); i++) {
            if (last.charAt(i) != first.charAt(i)) {
                break;
            }
            index = i;
        }
        if (index == -1) {
            return " ";
        } else {
            return first.substring(0, index + 1);
        }
    }

    public static void main(String[] args) {
        String[] ar = {"flower", "flop", "flow", "flight"};
        System.out.println(longestCommonPrefix(ar));
    }
}
