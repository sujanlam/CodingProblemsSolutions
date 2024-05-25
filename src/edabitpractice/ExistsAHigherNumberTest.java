package edabitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class ExistsAHigherNumberTest {

    @Test
    void existsHigher() {
        assertTrue(com.codes.edabitpractice.ExistsAHigherNumber.existsHigher(new int[] {2,11,5,7,8}, 10));
    }
    @Test
    void existsNoHigher() {
        assertFalse(com.codes.edabitpractice.ExistsAHigherNumber.existsHigher(new int[] {0,1,3,5}, 29));
    }

}