import java.util.*;
class digitsno{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        System.out.println("No of digits are: "+count);
    }
}