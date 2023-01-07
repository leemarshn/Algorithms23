import junit.framework.TestCase;

public class ParenthesesTest extends TestCase {

    public void testIsValid() {
        assertTrue(new Parentheses().isValid("(){}[]"));
        assertFalse(new Parentheses().isValid("[}{}()"));
    }
}