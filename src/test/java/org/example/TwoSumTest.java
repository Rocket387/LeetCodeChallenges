package org.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class TwoSumTest {

    private final TwoSumArray twoSumArray = new TwoSumArray();

    @Test
    public void TwoSumTestTrue(){
        int[] nums = {2,7,11,13};
        int target = 9;

        int[] expectedResult = { 0,  1 };
        int[] result = twoSumArray.twoSum(nums, target);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void TwoSumTestFalse() {

        int[] nums = {2,7,11,13};
        int target = 9;

        int[] expectedResult = { 0,  3 };
        int[] result = twoSumArray.twoSum(nums, target);
        assertNotEquals(expectedResult, result);
    }

}
