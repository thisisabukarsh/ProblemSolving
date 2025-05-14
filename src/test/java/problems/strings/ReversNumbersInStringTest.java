package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversNumbersInStringTest {

    @Test
    public void testBasicNumbersReversal() {
        String input = "hello 123 world 456";
        String expected = "hello 321 world 654";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }

    @Test
    public void testMixedWithLettersAndNumbers() {
        String input = "hello 123 abc456 789";
        String expected = "hello 321 abc456 987";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }

    @Test
    public void testOnlyDigits() {
        String input = "123 456 7890";
        String expected = "321 654 0987";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }

    @Test
    public void testNoDigits() {
        String input = "hello world";
        String expected = "hello world";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }

    @Test
    public void testSingleNumberWord() {
        String input = "999";
        String expected = "999";
        assertEquals(expected, ReversNumbersInString.reversNumbersInString(input));
    }
}
