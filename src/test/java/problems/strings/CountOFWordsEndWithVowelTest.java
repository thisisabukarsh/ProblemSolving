package problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountOFWordsEndWithVowelTest {

    @Test
    public void testWordsEndingWithVowels() {
        String input = "I love java and code everyday";
        int expected = 4; // I, love, java, everyday
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }

    @Test
    public void testWordsNotEndingWithVowels() {
        String input = "This test has not vowels";
        int expected = 0; // all end with consonants
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }

    @Test
    public void testMixedEndingWords() {
        String input = "Make sure to complete this";
        int expected = 4; // Make, to
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }

    @Test
    public void testSingleWordEndingWithVowel() {
        String input = "banana";
        int expected = 1;
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }

    @Test
    public void testSingleWordNotEndingWithVowel() {
        String input = "test";
        int expected = 0;
        assertEquals(expected, CountOFWordsEndWithVowel.countOfWordsEndWithVowel(input));
    }
}
