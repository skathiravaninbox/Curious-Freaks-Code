
class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[258];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        for (int j = 0; j < s1.length(); j++) {
            freq[s2.charAt(j)]--;
        }

        for (int i = 0; i < 258; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println(isAnagram(a, b));
    }
}
