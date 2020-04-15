package unit;

import org.junit.Test;

import java.util.Arrays;

public class ExceptionTest {

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullPointer() {
        int[] nums = null;
        Arrays.sort(nums);
    }
}
