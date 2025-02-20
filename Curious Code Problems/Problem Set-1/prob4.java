/*
Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid.
 */

import java.util.Scanner;
class prob4 {   
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Shirt size: ");
        int size = obj.nextInt();
        switch(size) {
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
