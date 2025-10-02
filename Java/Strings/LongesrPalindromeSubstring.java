class Solution {
  public String longestPalindrome(String s) {
    int start = 0;
    int maxLength = 1;

    for (int i = 1; i < s.length(); i++) {
      int left = i - 1;
      int right = i;
      while (left >= 0 && right < s.length() &&
             s.charAt(left) == s.charAt(right)) {
        if (right - left + 1 > maxLength) {
          maxLength = right - left + 1;
          start = left;
        }
        left--;
        right++;
      }

      left = i - 1;
      right = i + 1;

      while (left >= 0 && right < s.length() &&
             s.charAt(left) == s.charAt(right)) {
        if (right - left + 1 > maxLength) {
          maxLength = right - left + 1;
          start = left;
        }
        left--;
        right++;
      }
    }
    return s.substring(start, start + maxLength);
  }
}

public class LongesrPalindromeSubstring {
  public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "babad";
    System.out.println(solution.longestPalindrome(s));
  }
}