
class RotateString {

    public static boolean rotateStr(String s, String goal) {
        for (int i = 1; i <= s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "kathir";
        String goal = "irkaths";
        System.out.println(rotateStr(s, goal));
    }
}
