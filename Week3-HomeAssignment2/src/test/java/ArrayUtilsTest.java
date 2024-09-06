import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        // Test case to verify that two single-dimensional arrays with different elements are not considered equal
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 }; // Different last element
        assertFalse("Arrays should not be equal", ArrayUtils.areSingleDimensionalArraysEqual(a1, a2));
    }
    // multi dimensional array equality test case with negative result
    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };
        assertFalse("Arrays should not be equal", ArrayUtils.areMultiDimensionalArraysEqual(a11, a12));
    }
    // Single dimensional array equality test case with positive result
    @Test
    public void testSingleDimensionalArrayEqualityPositive() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertTrue("Arrays should be equal", ArrayUtils.areSingleDimensionalArraysEqual(a1, a2));
    }

    // multi dimensional array equality test case with positive result
    @Test
    public void testMultiDimensionalArrayEqualityPositive() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertTrue("Arrays should be equal", ArrayUtils.areMultiDimensionalArraysEqual(a11, a12));
    }
    // String array equality test case with positive result
    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals("String arrays should be equal", s1, s2);
    }
    // Double array equality test case with positive result
    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 }; // Same elements and order
        assertArrayEquals("Double arrays should be equal", d1, d2, 0.0001);
    }
}
