package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ComplexExamplesTest {

    @Test
    @DisplayName("Test twoSum Method")
    void twoSumTest() {
        int[] nums = new int[]{3, 4, 2, 7};
        int[] expected = new int[]{3, 7};
        int[] actual = ComplexExamples.twoSum(nums, 10);
        assertArrayEquals(expected, actual,
                "expected: " + Arrays.toString(expected)
                        + "\nactual: " + Arrays.toString(actual));
    }

    @Test
    @DisplayName("Test twoSum Method with empty array given")
    void twoSumWithEmptyArrTest() {
        int[] nums = new int[]{};
        int[] expected = new int[]{};
        int[] actual = ComplexExamples.twoSum(nums, 0);
        assertArrayEquals(expected, actual,
                "expected: " + Arrays.toString(expected)
                        + "\nactual: " + Arrays.toString(actual));
    }

    @Test
    @DisplayName("Test twoSum Method with 2 correct results, expected returning first found result")
    void twoSumMethod_ReturnFirstTwoNumsTest() {
        int[] nums = new int[]{3, 5, 2, 4, 6, 7};
        int[] expected = new int[]{4, 6};
        int[] actual = ComplexExamples.twoSum(nums, 10);
        assertArrayEquals(expected, actual,
                "expected: " + Arrays.toString(expected)
                        + "\nactual: " + Arrays.toString(actual));
    }

    @Test
    @DisplayName("Test twoSum Method with not existing sum, expected returning empty array")
    void twoSumMethod_GivenNotExistingSum_ExpectingEmptyArrTest() {
        int[] nums = new int[]{3, 5, 2, 4, 6, 7};
        int[] expected = new int[]{};
        int[] actual = ComplexExamples.twoSum(nums, -1);
        assertArrayEquals(expected, actual,
                "expected: " + Arrays.toString(expected)
                        + "\nactual: " + Arrays.toString(actual));
    }

    @Test
    @DisplayName("Test twoSum Method with null input as an array, expected returning empty array")
    void twoSumMethodWithNullAsInputTest() {
        int[] nums = null;
        int[] expected = new int[]{};
        int[] actual = ComplexExamples.twoSum(nums, 10);
        assertArrayEquals(expected, actual,
                "expected: " + Arrays.toString(expected)
                        + "\nactual: " + Arrays.toString(actual));
    }
}