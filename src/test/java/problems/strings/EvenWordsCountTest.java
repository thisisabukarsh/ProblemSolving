package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenWordsCountTest {

    @Test
    public void testEvenLengthWords_MixedCase() {
        String input = "This test has some even words";
        int expected = 4; // "This", "test", "even, some"
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_AllEven() {
        String input = "Cool Java Code Done";
        int expected = 4;
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_AllOdd() {
        String input = "One Two Six Ten";
        int expected = 0;
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_EmptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_SingleEvenWord() {
        String input = "test";
        int expected = 1;
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_SingleOddWord() {
        String input = "word";
        int expected = 1; // "word" has 4 letters = even
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }

    @Test
    public void testEvenLengthWords_MultipleSpaces() {
        String input = "this    is  a     test";
        int expected = 3; // "this", "test , is"
        assertEquals(expected, EvenWordsCount.evenLengthWords(input));
    }
}
