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

    @Test
    public void testMultiDimensionalArrayEquality() {
        // Test case to verify that two multi-dimensional arrays with different elements are not considered equal
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } }; // Different last element in the last sub-array
        assertFalse("Arrays should not be equal", ArrayUtils.areMultiDimensionalArraysEqual(a11, a12));
    }

    @Test
    public void testSingleDimensionalArrayEqualityPositive() {
        // Test case to verify that two identical single-dimensional arrays are considered equal
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 }; // Same elements and order
        assertTrue("Arrays should be equal", ArrayUtils.areSingleDimensionalArraysEqual(a1, a2));
    }

    @Test
    public void testMultiDimensionalArrayEqualityPositive() {
        // Test case to verify that two identical multi-dimensional arrays are considered equal
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } }; // Same elements and order in sub-arrays
        assertTrue("Arrays should be equal", ArrayUtils.areMultiDimensionalArraysEqual(a11, a12));
    }

    @Test
    public void testStringArrayEquality() {
        // Test case to verify that two identical string arrays are considered equal
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" }; // Same elements and order
        assertArrayEquals("String arrays should be equal", s1, s2);
    }

    @Test
    public void testDoubleArrayEquality() {
        // Test case to verify that two identical double arrays are considered equal with a tolerance for floating-point comparisons
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 }; // Same elements and order
        assertArrayEquals("Double arrays should be equal", d1, d2, 0.0001); // Tolerance level for floating-point comparison
    }
}
