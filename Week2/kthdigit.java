class kthdigit{
    public static void main(String args[]){
        int A = 4,B = 4,K = 2;
        
        long x=(long)Math.pow(A,B);
        long temp = 0;
        // find the Kth digit from right
	    while(K>0)
	    {
	        // getting last digit 
	        temp=x%10;
	        // remove last digit
	        x=x/10;
	        K--;
	    }
        
        System.out.println(temp);
    }
}