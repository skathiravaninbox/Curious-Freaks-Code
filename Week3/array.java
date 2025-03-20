class array{
    public static void main(String args[]){
        int [] arr=new int[5];
        arr[0]=5;
        arr[2]=23;
        arr[4]=88;
        System.out.println("For Loop");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("While Loop");
        int j=0;
        while(j<5){
            System.out.println(arr[j]);
            j++;
        }
    }   
}
