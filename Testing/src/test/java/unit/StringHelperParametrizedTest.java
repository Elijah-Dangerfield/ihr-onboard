package unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

    private String input;
    private String expectedOutput;
    StringHelper helper = new StringHelper();

    public StringHelperParametrizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] tests = {{"ACD","CD"},{"AABC","BC"}};
        return Arrays.asList(tests);
    }

    @Before
    public void setup() {/*pretend setup for each test */}
    @After
    public void tearDown() {/*pretend treardown for each test */}

    @Test
    public void testTruncateInFirst2Positions_2removals() {
        assertEquals(expectedOutput,helper.truncateInFirst2Positions(input));
    }
}