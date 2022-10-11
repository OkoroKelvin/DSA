package Arrays;

public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();

        for (int i = 0; i < m - n + 1; i++) {
            if (haystack.substring(i, n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int response =  strStr("leetcode","leeto");
        System.out.println(response);
    }


}
