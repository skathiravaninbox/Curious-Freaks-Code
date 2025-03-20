
import java.util.*;

class prime {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = obj.nextInt();
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (n / i != i) {
                    sum = sum + (n / i);
                }
            }
        }
        if (sum == n) {
            System.out.println("It is a Perfect Number");
        } else {
            System.out.println("It is NOT a Perfect Number");
        }
    }
}
