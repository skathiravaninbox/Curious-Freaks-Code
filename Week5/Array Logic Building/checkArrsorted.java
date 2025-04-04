class checkArrsorted{
    public static boolean checkArrSort(int[] arr){
        if(arr.length==0) return true;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 4, 2};

        System.out.println(checkArrSort(arr1)); // Output: true
        System.out.println(checkArrSort(arr2)); // Output: false
    }
}