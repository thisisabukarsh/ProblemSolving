package problems.strings;

import org.junit.jupiter.api.Test;
import problems.strings.StringFrequency;

import static org.junit.jupiter.api.Assertions.*;

public class StringFrequencyTest {

    @Test
    public void testFrequency_NormalCase() {
        assertEquals("a2b2c3", StringFrequency.frequency("aabbccc"));
    }

    @Test
    public void testFrequency_WithSpaces() {
        assertEquals("a2b2c3", StringFrequency.frequency("aa bb ccc"));
    }

    @Test
    public void testFrequency_SingleCharacters() {
        assertEquals("a1b1c1", StringFrequency.frequency("a b c"));
    }

    @Test
    public void testFrequency_MixedGroups() {
        assertEquals("a3b1c2a1", StringFrequency.frequency("aaabcca"));
    }

    @Test
    public void testFrequency_EmptyString() {
        assertEquals("", StringFrequency.frequency(""));
    }

    @Test
    public void testFrequency_OneCharacter() {
        assertEquals("a1", StringFrequency.frequency("a"));
    }

    @Test
    public void testFrequency_SameCharacter() {
        assertEquals("z5", StringFrequency.frequency("zzzzz"));
    }

    @Test
    public void testFrequency_SpaceOnlyString() {
        assertEquals("", StringFrequency.frequency("     "));
    }
}
