package unit.basic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void testArraySort_correct_order() {
        int[] test = {12,14,16,32,11,5};
        int[] answer = {5,11,12,14,16,32};
        Arrays.sort(test);
        assertArrayEquals(test, answer);
    }

    @Test
    public void testArraySort_incorrect_order() {
        int[] test = {12,14,16,32,11,5};
        int[] answer = {5,12,1,14,16,32};
        Arrays.sort(test);
        assertFalse(Arrays.equals(test,answer));
    }
}
