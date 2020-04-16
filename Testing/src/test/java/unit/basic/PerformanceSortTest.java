package unit.basic;

import junit.framework.TestCase;
import org.junit.Test;
import unit.PerformanceSort;

public class PerformanceSortTest extends TestCase {
    PerformanceSort sorter = new PerformanceSort();

    @Test(timeout = 1000)
    public void testSort_withinTimeout(){
        sorter.sortArrays();
    }
}