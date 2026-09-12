package functionTest;

import function.Function;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {
    @Test
    public void testThatitIsEven(){
        Function array = new Function();
        int [] number = {1,2,3,4,5,6,7,8,9};
        boolean expected = true;
        boolean actual = array.isEven(number);
        assertEquals(true, actual);


    }
}
