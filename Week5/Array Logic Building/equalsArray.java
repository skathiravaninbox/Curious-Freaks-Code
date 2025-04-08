import java.util.*;

class equalsArray{

    public static int[] sortingArray(int[] arr){
        if(arr.length==1)
            return arr;
        
        int mid=arr.length/2;

        int[] left=sortingArray(Arrays.copyOfRange(arr,0,mid));
        int[] right=sortingArray(Arrays.copyOfRange(arr,mid,arr.length));

        return sorting(left,right);
    }

    public static int[] sorting(int[] first,int[] second){
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

    public static boolean checkEqualArrays(int[] arr1, int[] arr2){
        boolean result=Arrays.equals(arr1, arr2);
        return result;
    }

    public static void main(String args[]){
        int[] a={1, 3, 5, 4};
        int[] b={3, 4, 7, 5};
        System.out.println(checkEqualArrays(sortingArray(a),sortingArray(b)));
    }
}