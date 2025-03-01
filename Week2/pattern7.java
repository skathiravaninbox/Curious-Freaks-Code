import java.util.*;
class pattern7{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}