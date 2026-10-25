import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLetterTest {

    private ReverseLetter reverseLetter = new ReverseLetter();

    @Test
    public void reverseLetter_shouldReverseString_ifContainsString() {
        String result = reverseLetter.reverseLetter("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverseLetter_shouldReturnEmptyString_ifContainsEmptyString() {
        String result = reverseLetter.reverseLetter("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverseLetter_shouldReturnOneLetter_ifContainsOneLetter() {
        String result = reverseLetter.reverseLetter("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverseLetter_shouldReturnStringWithoutLetters_ifContainsNoLetters() {
        String result = reverseLetter.reverseLetter("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverseLetter_shouldReturnOnlyLetters_ifContainsOnlyLetters() {
        String result = reverseLetter.reverseLetter("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void reverseLetter_shouldKeepsNonLettersInPlace() {
        String result = reverseLetter.reverseLetter("!!aaa++bbb??");
        Assertions.assertEquals("!!bbb++aaa??", result);
    }

    @Test
    public void reverseLetter_shouldPreservesLetterCase() {
        String result = reverseLetter.reverseLetter("XyZ");
        Assertions.assertEquals("ZyX", result);
    }

    @Test
    public void reverseLetter_shouldReturnEmptyString_ifContainsNull() {
        String result = reverseLetter.reverseLetter(null);
        Assertions.assertEquals("", result);
    }










}
