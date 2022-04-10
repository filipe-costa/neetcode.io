package arraysandhashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private static ValidAnagram validAnagram;

    @BeforeAll
    static void init() {
        validAnagram = new ValidAnagram();
    }

    @Test
    public void should_return_true() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    public void should_return_false() {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.isAnagram(s, t));
    }
}