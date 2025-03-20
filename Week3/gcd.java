
import java.util.*;

class gcd {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int gcdv = 1;
        int a = 15, b = 25;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcdv = i;
            }
        }
        System.out.println("GCD: " + gcdv);
    }
}
