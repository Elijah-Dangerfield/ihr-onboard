package unit;

import java.util.Arrays;

public class PerformanceSort {

    /*
    bulking sorting function such that we can assert performance in tests
     */
    public void sortArrays() {
        int[] nums = {1,2,3,6,7,42,12};
        for(int i = 0 ; i < 10000; i++) {
            nums[0] = i;
            Arrays.sort(nums);
        }
    }
}
