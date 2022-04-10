package twopointers;

// https://leetcode.com/problems/valid-palindrome/
public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        int length = s.length();
        for(int i = 0; i < length / 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(length - 1 - i);
            if(c1 != c2) {
                return false;
            }
        }

        return true;
    }
}
