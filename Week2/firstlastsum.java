import java.util.*;
class digitsno{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        int count=0;
        int sum=0;
        while( n>0){
           int ld=n%10;
            count=count+1;
            n=n/10;
            if(n==0||count==1){
                
                sum=sum+ld;
            }
        }
        System.out.println("Sum of 1st and last digits are: "+sum);
    }
}