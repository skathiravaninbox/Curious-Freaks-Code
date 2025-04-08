
//String Basic with ASCII & Char code change
import java.util.*;
class ASCIIBasic{
    public static void main(String args[]){
        char a[]=new char[15];
        Scanner obj=new Scanner(System.in);

        String input=obj.nextLine();
        for(int i=0;i<input.length() && i<15; i++){
            a[i]=input.charAt(i);
        }

        a[0]=(char)(a[0]+3);
        a[1]=(char)(a[1]+2);

        System.out.println(new String(a).trim());
    }
}