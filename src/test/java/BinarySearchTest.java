import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 5;
        int expected = 4;
        int result = BinarySearch.binarySearch(arr, x);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 10;
        int expected = -1;
        int result = BinarySearch.binarySearch(arr, x);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int x = 10;
        int expected = -1;
        int result = BinarySearch.binarySearch(arr, x);
        Assert.assertEquals(expected, result);
    }

}