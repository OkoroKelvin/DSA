package Arrays;

public class LongestPalindromicSubsequence {
//    Given a string S, find the common palindromic sequence
//            ( A sequence that does not need to be contiguous and is a palindrome), which is common in itself.
    public static int LPS(String S) {
        int[][] dp = new int[S.length()][S.length()];

        for (int i = S.length() - 1; i >= 0; i--) {

            dp[i][i] = 1;
            for (int j = i+1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {

                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][S.length()-1];
    }


    public static void main(String[] args) {
        System.out.println( LPS("AABCDEBAZ"));
    }

//    Time Complexity: O(N^2) where N is the size of the string S.
//    Space Complexity: O(N^2), as extra dp array is used.

}
