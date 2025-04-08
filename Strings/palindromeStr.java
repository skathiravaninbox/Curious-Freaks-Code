

class palindromeStr{
    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean isPalidrome=palindrome("kathir");
        System.out.println(isPalidrome ? "It's Palindrome" : "It's Not a Palindrome");
    }
}