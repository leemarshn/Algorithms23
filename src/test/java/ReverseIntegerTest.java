import junit.framework.TestCase;
import org.junit.Test;

public class ReverseIntegerTest extends TestCase {

    ReverseInteger r = new ReverseInteger();

    @Test
    public void testReversePositive() {
        assertEquals(321, r.reverseInteger(123));
        assertEquals(54321, r.reverseInteger(12345));
    }

    @Test
    public void testReverseNegative() {
        assertEquals(-321, r.reverseInteger(-123));
        assertEquals(-9, r.reverseInteger(-9000000));
    }

    @Test
    public void testReverseOverflow() {
        assertEquals(0, r.reverseInteger(Integer.MAX_VALUE));
        assertEquals(0, r.reverseInteger(Integer.MIN_VALUE));
    }

    @Test
    public void testReverseZero() {
        assertEquals(0, r.reverseInteger(0));
    }

    public void setUp() throws Exception {
        super.setUp();
    }
}