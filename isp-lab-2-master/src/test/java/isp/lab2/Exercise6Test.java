package isp.lab2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise6Test {
    int[] testVector = new int[]{1, 2, 2, 4, 8, 32, 256, 8192};

    @Test
    public void TestRecursive() {
        assertTrue("For 8 elements the generated recursively vector should be"+ testVector, Arrays.equals(testVector,Exercise6.generateRandomVectorRecursively(8)));
        //assertEquals("For 8 elements the generated recursively vector should be " + testVector, testVector, Exercise6.generateRandomVectorRecursively(8));
    }

    @Test
    public void TestNonRecursive() {
        assertTrue("For 8 elements the generated recursively vector should be"+ testVector, Arrays.equals(testVector,Exercise6.generateVector(8)));
        //assertEquals("For 8 elements the generated recursively vector should be " + testVector, testVector, Exercise6.generateVector(8));
    }
}
