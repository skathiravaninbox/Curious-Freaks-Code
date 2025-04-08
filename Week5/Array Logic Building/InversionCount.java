

class InversionCount{
    // Function to count inversions in the array.
    static int invCount(int arr[]) {
        int count=0, n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {2, 4, 1, 7, 3, 5, 1};
        System.out.println(invCount(arr));
    }
}
