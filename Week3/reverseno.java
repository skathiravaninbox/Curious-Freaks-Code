import java.util.*;
class reverseno{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number that you want reverse: ");
        int n=obj.nextInt();
        int rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.print("The reverse number is: "+rev);
    }
}