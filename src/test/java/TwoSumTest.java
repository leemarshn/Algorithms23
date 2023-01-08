import junit.framework.TestCase;

import java.util.Arrays;

public class TwoSumTest extends TestCase {

    TwoSum twoSum = new TwoSum();
    public void testSumArray() {
        assertEquals(Arrays.toString(new int[]{2,3}), Arrays.toString(twoSum.sumArray(new int[]{8,7,11,15}, 26)));
    }
}