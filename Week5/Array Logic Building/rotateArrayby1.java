
import java.util.Arrays;

class rotateArrayby1{
    public static void rotateArr(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5};
        rotateArr(a);
        System.out.println(Arrays.toString(a));
    }
}