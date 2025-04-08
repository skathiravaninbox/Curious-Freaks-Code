
class RotateStrOptiSoul {

    public static boolean rotateStr(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        String s = "kathir";
        String goal = "rkathi";
        System.out.println(rotateStr(s, goal));
    }
}
