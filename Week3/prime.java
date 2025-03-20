
import java.util.*;

class prime {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = obj.nextInt();
        for (int i = 2; i <= n; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
