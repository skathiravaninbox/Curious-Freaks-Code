
import java.util.*;

class pattern9{

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
