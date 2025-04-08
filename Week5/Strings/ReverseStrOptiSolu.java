class ReverseStrOptiSolu{
    public static void main(String[] args) {
        String str="Kathir";
        char[] chars=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<=j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        String reverseStr=new String(chars);
        System.out.println(reverseStr);
    }
}