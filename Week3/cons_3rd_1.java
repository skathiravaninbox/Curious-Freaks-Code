import java.util.*;
class cons_3rd_1{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.print(sum);
    }
}