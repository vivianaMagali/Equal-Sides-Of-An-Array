package kata.EqualSidesOfAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSidesOfAnArrayTestSuites {


    @Test
    public void sample_one(){
        assertEquals(3,EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }


}
