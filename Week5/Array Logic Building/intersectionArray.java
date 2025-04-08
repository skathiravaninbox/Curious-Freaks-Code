
class intersectionArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int flag = 1;
                    for (int h = 0; h < k; h++) {
                        if (res[h] == nums1[i]) {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        res[k] = nums1[i];
                        k++;
                    }
                    break;
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = res[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 6, 7, 7, 7, 8};
        int[] b = {4, 5, 5, 8, 9, 9, 10, 19, 20};

        int[] res = intersection(a, b);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
