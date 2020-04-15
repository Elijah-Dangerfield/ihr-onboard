package unit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Before public void setup() {/*pretend setup for each test */}
    @After public void tearDown() {/*pretend treardown for each test */}


    StringHelper helper = new StringHelper();
    @Test
    public void testTruncateInFirst2Positions_2removals() {
        assertEquals("BC",helper.truncateInFirst2Positions("AABC"));
    }

    @Test
    public void testTruncateInFirst2Positions_1removals() {
        assertEquals("BC",helper.truncateInFirst2Positions("ABC"));
    }

    @Test
    public void testFirstAndLastTwoCharactersTheSame_returnFalse() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testFirstAndLastTwoCharactersTheSame_returnTrue() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AABDCAA"));
    }
}