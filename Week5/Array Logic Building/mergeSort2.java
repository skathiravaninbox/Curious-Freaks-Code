import java.util.*;
public class mergeSort2{
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first,int[] second){
        int[] joined=new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j])
                joined[k++]=first[i++];
            else    
                joined[k++]=second[j++];
        }
            while(i<first.length)
                joined[k++]=first[i++];
            while(j<second.length)
                joined[k++]=second[j++];
            return joined;
        }

        public static void main(String[] args){
            int[] arr={9,4,7,1,6,2,8,4};
            System.out.print(Arrays.toString(mergeSort(arr)));
        }
    }
