package kata.EqualSidesOfAnArray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSidesOfAnArrayTestSuites {


    @Test
    public void sample_one() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1))));
    }

    @Test
    public void sample_two() {
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new ArrayList<>(Arrays.asList(1,100,50,-51,1,1))));
    }


}
