 import java.util.*;
class arrayin{
    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the Array n value: ");
    int n=obj.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("Enter the arr["+i+"] index of array value: ");
        arr[i]=obj.nextInt();
    }
    System.out.println("------------------------------------");
    System.out.println("The array values are: ");
    int j=0;
    while(j<n)
    {
        System.out.println("arr["+j+"]: "+arr[j]);
        j++;
    }
    }   
}
