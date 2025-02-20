/*
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times
 */
import java.util.Scanner;

class prob3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        String fn = obj.next();
        System.out.print("Enter LastName: ");
        String ln = obj.next();
        System.out.print("How many times needs to print your Name: ");
        int n = obj.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(i + ". " + fn + " " + ln);
        }
    }
}
