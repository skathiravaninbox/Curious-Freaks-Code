import java.util.*;
class FindKthRotation{
    public int findKRotation(List<Integer> arr) {
        int minIndex=0;
        
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<arr.get(minIndex)){
                minIndex=i;
            }
        }
        return minIndex;
        
    }
    
    public static void main(String[] args){
        FindKthRotation findK=new FindKthRotation();
        List<Integer> arr1=List.of(3, 4, 5, 1, 2);
        System.out.println(findK.findKRotation(arr1));
    }
}