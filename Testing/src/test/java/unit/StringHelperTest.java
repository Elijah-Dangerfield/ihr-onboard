package unit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class StringHelperTest {

    @Test
    public void returnsTrue() {
        String test = "AABC";
        assertEquals(test,"AABC");
    }
}