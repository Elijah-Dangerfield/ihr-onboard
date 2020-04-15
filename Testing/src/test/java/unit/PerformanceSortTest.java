package unit;

import junit.framework.TestCase;
import org.junit.Test;

public class PerformanceSortTest extends TestCase {
    PerformanceSort sorter = new PerformanceSort();

    @Test(timeout = 1000)
    public void testSort_withinTimeout(){
        sorter.sortArrays();
    }
}