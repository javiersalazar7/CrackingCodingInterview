import java.util.Arrays;

public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1New = s1.toCharArray();
        Arrays.sort(s1New);
        char[] s2New = s1.toCharArray();
        Arrays.sort(s2New);

        return Arrays.equals(s1New, s2New);
    }

    public static void main(String[] args) {

        CheckPermutation cp = new CheckPermutation();
        System.out.println(cp.checkPermutation("abc", "cba"));
        System.out.println(cp.checkPermutation("ab", "cba"));
        System.out.println(cp.checkPermutation("abc", "ab"));
    }
}
