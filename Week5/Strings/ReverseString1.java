class ReverseString1{
    public static void main(String[] args) {
        String str="Kathir";
        String cpystr="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            cpystr=cpystr+c;
        }
        str=cpystr;
        System.out.println(str);
    }
}