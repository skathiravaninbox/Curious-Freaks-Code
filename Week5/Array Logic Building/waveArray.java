import java.util.*;
class waveArray{
 static void waveArr(int[] arr){
    int n=arr.length;
    for (int i=0;i<n-1;i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
 }

 public static void main(String[] args) {
     int[] a={1, 2, 3, 4, 5, 6, 7};
     waveArr(a);
     System.out.println(Arrays.toString(a));
 }
}