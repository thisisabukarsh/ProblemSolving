package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testEvenLengthWords_case1() {
        assertEquals(4, Main.evenLengthWords("I am coding in Java"));
    }

    @Test
    public void testEvenLengthWords_case2() {
        assertEquals(0, Main.evenLengthWords("Hello World"));
    }

    @Test
    public void testEvenLengthWords_case3() {
        assertEquals(3, Main.evenLengthWords("Go to the moon now"));
    }

    @Test
    public void testEvenLengthWords_case4() {
        assertEquals(3, Main.evenLengthWords("AI is future"));
    }

    @Test
    public void testReversString_MixedCase() {
        assertEquals("abdulrahman UBA Karsh", Main.reversString("abdulrahman ABU Karsh"));
    }

    @Test
    public void testReversString_EmptyString() {
        assertEquals("", Main.reversString(""));
    }

    @Test
    public void testReversString_AllUpperCaseWords() {
        assertEquals("OLLEH DLROW", Main.reversString("HELLO WORLD"));
    }

    @Test
    public void testReversString_NoUppercaseWords() {
        assertEquals("hello world java", Main.reversString("hello world java"));
    }


    @Test
    public void testReversNumbersInString_NormalCase() {
        assertEquals("hello 321 45world 9876 java", Main.reversNumbersInString("hello 123 45world 6789 java"));
    }

    @Test
    public void testReversNumbersInString_AllNumbers() {
        assertEquals("321 654 987", Main.reversNumbersInString("123 456 789"));
    }

    @Test
    public void testReversNumbersInString_NoNumbers() {
        assertEquals("hello world", Main.reversNumbersInString("hello world"));
    }

    @Test
    public void testReversNumbersInString_EmptyString() {
        assertEquals("", Main.reversNumbersInString(""));
    }

    @Test
    public void testReversNumbersInWord_MixedWords() {
        assertEquals("123  ab 45  cd 6  ef", Main.reversNumbersInWord("ab123 cd45 ef6"));
    }

    @Test
    public void testReversNumbersInWord_OnlyLetters() {
        assertEquals("  abc", Main.reversNumbersInWord("abc"));
    }

    @Test
    public void testReversNumbersInWord_OnlyDigits() {
        assertEquals("123  ", Main.reversNumbersInWord("123"));
    }

    @Test
    public void testLongestWord_NormalCase() {
        assertEquals("abdulrahman", Main.longestWord("abdulrahman ABU Karsh"));
    }

    @Test
    public void testLongestWord_MultipleSameLength() {
        assertEquals("java", Main.longestWord("java code test"));
    }

    @Test
    public void testLongestWord_OneWord() {
        assertEquals("hello", Main.longestWord("hello"));
    }


    @Test
    public void testCapitalWordsCount_MixedCase() {
        assertEquals(2, Main.capitalWordsCount("hello World Java"));
    }

    @Test
    public void testCapitalWordsCount_AllLower() {
        assertEquals(0, Main.capitalWordsCount("this is a test"));
    }

    @Test
    public void testCapitalWordsCount_AllUpper() {
        assertEquals(3, Main.capitalWordsCount("HELLO WORLD JAVA"));
    }

    @Test
    public void testVowelsCount_MultipleWordsEndingInVowels() {
        assertEquals(3, Main.vowelsCount("banana apple cake"));
    }

    @Test
    public void testVowelsCount_NoVowels() {
        assertEquals(0, Main.vowelsCount("test dry gym"));
    }

    @Test
    public void testVowelsCount_AllVowelsEndings() {
        assertEquals(5, Main.vowelsCount("a e i o u"));
    }
}
