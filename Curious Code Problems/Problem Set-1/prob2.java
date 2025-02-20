/* Write a program to check whether a triangle can be formed with the given values for the angles.
If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.*/

import java.util.Scanner;

class prob2 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the 1st angel value of the triangle: ");
        int num1 = obj.nextInt();
        System.out.print("Enter the 2nd angel value of the triangle: ");
        int num2 = obj.nextInt();
        System.out.print("Enter the 3rd angel value of the triangle: ");
        int num3 = obj.nextInt();
        if (num1 + num2 + num3 == 180) {
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
