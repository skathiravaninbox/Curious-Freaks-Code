/* /*
Write a program to take x and print multiples of x till 1000.
 */
import java.util.Scanner;

class prob2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = obj.nextInt();
        for (int i = x; i <= 1000; i = i + 100) {
            System.out.println(i);
        }
    }
}
 