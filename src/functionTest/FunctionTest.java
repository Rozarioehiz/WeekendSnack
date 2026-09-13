package functionTest;

import function.Function;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {
    @Test
    public void testItsEven(){
        Function array = new Function();
        int [] number = {1,2,3,4,5,6,7,8,9};
        boolean expected = true;
        boolean actual = array.isEven(number);
        assertEquals(true, actual);
    }
    @Test
    public void testItsOdd(){
        Function array = new Function();
        int [] numbers = {1,2,3,4,5,6,7,8,9};
//        boolean expected = true;
        boolean actual = array.oddNumbers(numbers);
        assertEquals(true, actual);
    }
    @Test
    public void testThatItPalindrome(){
        Function array = new Function();
        int [] numbers = {1,2,5,2,1};;
       boolean expected = true;
        boolean actual = array.itPalindrome(numbers);
        assertEquals(expected, actual);
    }
    @Test
    public void testForsubtraction(){
        Function array = new Function();

        boolean actual = array.subtractNumber(7,3);
        assertEquals(true, actual);

    }
    @Test
    public void testSquareOfNumbers(){
        Function array = new Function();
        int [] number = {4};
        boolean actual = array.itsSquare(number);
        assertEquals(true, actual);
    }
}
