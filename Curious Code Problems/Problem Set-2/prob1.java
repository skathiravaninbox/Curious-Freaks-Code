/* Write a program which takes two values x and y. Prints x for y number of times.*/
import java.util.Scanner;

class prob1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = obj.nextInt();
        System.out.print("Enter y value: ");
        int y = obj.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.println(x);
        }
    }
}
