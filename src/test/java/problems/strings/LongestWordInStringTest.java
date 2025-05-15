package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestWordInStringTest {

    @Test
    public void testNormalCase() {
        String input = "I love programming";
        String expected = "programming";
        assertEquals(expected, LongestWordInString.longestWord(input));
    }

    @Test
    public void testMultipleSameLengthWords() {
        String input = "cat dog bat rat";
        String expected = "cat"; // first longest word
        assertEquals(expected, LongestWordInString.longestWord(input));
    }

    @Test
    public void testSingleWord() {
        String input = "Supercalifragilisticexpialidocious";
        String expected = "Supercalifragilisticexpialidocious";
        assertEquals(expected, LongestWordInString.longestWord(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, LongestWordInString.longestWord(input));
    }

    @Test
    public void testAllWordsSameLength() {
        String input = "one two six ten";
        String expected = "one"; // first in order
        assertEquals(expected, LongestWordInString.longestWord(input));
    }

    @Test
    public void testWordWithPunctuation() {
        String input = "hi hello! goodbye";
        String expected = "goodbye"; // ignores punctuation in logic
        assertEquals(expected, LongestWordInString.longestWord(input));
    }
}
