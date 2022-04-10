package arraysandhashing;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        String sortedS = new String(charsS);
        String sortedT = new String(charsT);

        return sortedS.equals(sortedT);
    }
}
