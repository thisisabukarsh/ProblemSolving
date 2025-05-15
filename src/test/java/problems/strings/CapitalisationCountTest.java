package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalisationCountTest {

    @Test
    public void testSomeCapitalisedWords() {
        String input = "Java is Fun To Learn";
        int expected = 4; // Java, Fun, To
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }

    @Test
    public void testAllCapitalisedWords() {
        String input = "Hello World From Java";
        int expected = 4;
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }

    @Test
    public void testNoCapitalisedWords() {
        String input = "hello world     from java";
        int expected = 0;
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        // should not throw error; returns 0
        int expected = 0;
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }

    @Test
    public void testSingleCapitalisedWord() {
        String input = "Hello";
        int expected = 1;
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }

    @Test
    public void testSingleLowercaseWord() {
        String input = "hello";
        int expected = 0;
        assertEquals(expected, CapitalisationCount.capitalisationCount(input));
    }
}
