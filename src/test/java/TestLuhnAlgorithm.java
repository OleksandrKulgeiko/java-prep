import com.kulgeiko.codingtasks.LuhnAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akulgeiko on 7/18/2018.
 */

public class TestLuhnAlgorithm {

    @Test
    public void testCardValidation(){
        int[] cardNumberInValid = {4,2,0,5,4,5,6,8,9,6,5,4,4,1,2,3};
        assertFalse(LuhnAlgorithm.validateCardNumber(cardNumberInValid));
        int[] cardNumberValid = {4,5,6,1,2,6,1,2,1,2,3,4,5,4,6,7};
        assertTrue(LuhnAlgorithm.validateCardNumber(cardNumberValid));
    }
}
