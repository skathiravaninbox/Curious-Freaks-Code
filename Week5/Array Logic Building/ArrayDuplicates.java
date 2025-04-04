import java.util.*;
class ArrayDuplicates{
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    count++;
                }
            }

            if (count > 1) {
                boolean flag = true;
                for (int k = 0; k < res.size(); k++) {
                    if (res.get(k) == arr[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res.add(arr[i]);
                }
            }
        }

        return res;
    }
public static void main(String[] args) {
       int [] a = {3,4,5,6,6,7,7,7,8,8};
       System.out.println(findDuplicates(a));
    }
}

