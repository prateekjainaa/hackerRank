package easy;

public class AppendDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        char[] ori = s.toCharArray();
        char[] to = t.toCharArray();
        int i;
        if (ori.length + to.length <= k) {
            return "Yes";
        }
        for (i = 0; i < ori.length && i < to.length; i++) {
            if (ori[i] != to[i]) {
                break;
            }

        }//for
        System.out.println(i);
        if ((ori.length - i) + (to.length - i) <= k) {
            return "Yes";
        }

        return "No";

    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hacker", "hackerrank", 9));

    }

}
