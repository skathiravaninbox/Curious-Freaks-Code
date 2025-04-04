
import java.util.*;

class move0toend{
    public static void push0toend(int[] arr){
        int n;
        n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args){
        int[] aa={4, 0, 5, 0};
        push0toend(aa);
        System.out.println(Arrays.toString(aa));
    }
}