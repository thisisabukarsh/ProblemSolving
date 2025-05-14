package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversCapitalWordInStringTest {

    @Test
    public void testSingleCapitalWord() {
        String input = "HELLO";
        String expected = "OLLEH";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }

    @Test
    public void testMixedCapitalAndLowercase() {
        String input = "hello WORLD foo BAR";
        String expected = "hello DLROW foo RAB";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }

    @Test
    public void testNoCapitalWords() {
        String input = "this is lowercase only";
        String expected = "this is lowercase only";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }

    @Test
    public void testAllCapitalWords() {
        String input = "FOO BAR BAZ";
        String expected = "OOF RAB ZAB";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }

    @Test
    public void testSingleLowercaseWord() {
        String input = "java";
        String expected = "java";
        assertEquals(expected, ReversCapitalWordInString.reversCapitalWordInString(input));
    }
}
