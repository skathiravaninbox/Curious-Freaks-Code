import java.util.*;
class hashSet{
    public static void main(String[] args) {
        int count=0;
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(34);
        hashset.add(31);
        hashset.add(44);
        hashset.add(352);
        hashset.add(28);
        
         // Example array to check duplicates or add new items
        int[] arr = {34, 50, 31, 60, 28};  // Sample array for demonstration
        
        // Loop through the array and check if the element is already in the HashSet
        for (int i = 0; i < arr.length; i++) {
            if (hashset.contains(arr[i])) {
                count++;  // Increment count if the element is already present
            } else {
                hashset.add(arr[i]);  // Add element to the set if it's not present
            }
        }
        
        // Printing the results
        System.out.println("Updated HashSet: " + hashset);
        System.out.println("Count of duplicates found: " + count);
    }
}

