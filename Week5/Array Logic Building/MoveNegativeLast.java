import java.util.*;
class MoveNegativeLast{
public static void pushNegativeLast(int[] arr) {
        List<Integer> pos=new ArrayList<>(), neg=new ArrayList<>();
        for(int num: arr){
            if(num <0){
                neg.add(num);
            }else{
                pos.add(num);
            }
            
        }
        
        int j=0;
        for(int num: pos){
            arr[j++]=num;
        }
        for(int num: neg){
            arr[j++]=num;
        }
}

public static void main(String[] args) {
    int[] arr={7, 8, -1, 4, -1, 5, -2, 4};
    //int[] arr = {1, -1, 3, -2, -3, 5, 6};
    pushNegativeLast(arr);
    WSystem.out.println(Arrays.toString(arr));
}
}