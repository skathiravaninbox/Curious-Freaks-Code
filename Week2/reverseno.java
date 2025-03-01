import java.util.Scanner;

class reverseno {

    public static void main(String[] args) {
        String rv="";
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = obj.nextInt();
        while(n>0) {
            int ld=n%10;
            //System.out.print(ld);
            rv=rv+ld;
            n=n/10;
        }
        System.out.print("Revised value is: "+rv);
    }

}