import java.util.Scanner;

class pattern11{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*n)-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }