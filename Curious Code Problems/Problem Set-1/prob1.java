/*Prob 1 : Write a program that takes an integer, then a string, 
then a char from the user and prints them in the screen.*/

import java.util.Scanner;

class prob1 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter your Name: ");
        String name = obj.next();
        System.out.print("Enter your Father's/Monther's first letter (Initial): ");
        char inti = obj.next().charAt(0);
        System.err.println("User given Name is " + inti + ". " + name);
        System.err.println("User give Age is " + age);

    }
}
