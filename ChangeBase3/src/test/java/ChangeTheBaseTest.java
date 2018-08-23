
import org.hamcrest.Matchers;
        import org.junit.Assert;
        import org.junit.Test;

public class ChangeTheBaseTest {
    @org.junit.Test
    public void shouldReturnString0Given0Base2() {
        verifyConvertNumber(0, 2, "0");
    }

    @Test
    public void shouldReturnString1Given1Base2() {
        verifyConvertNumber(1, 2, "1");
    }

    @Test
    public void shouldReturnString10Given2Base2() {
        verifyConvertNumber(2,2,"10");
    }

    @Test
    public void shouldReturnString11Given3Base2() {
        verifyConvertNumber(3,2,"11");
    }

    @Test
    public void shouldReturnString100Given4Base2() {
        verifyConvertNumber(4,2,"100");
    }

    /*...*/

    @Test
    public void shouldReturnString1000Given8Base2() {
        verifyConvertNumber(8,2,"1000");
    }




    /*
    0 -> 0
    1 -> 1
    2 -> 10
    3 -> 11
    4 -> 100
    5 -> 101
    6 -> 110
    7 -> 111
    8 -> 1000


    1) When number is less than 2 it is equal to itself.
    return Integer.toString(number);

    2)
    4 is the same as 2 with an extra 0 at the end
    6 is the same as 3 with an extra 0 at the end
    8 is the same as 4 with an extra 0 at the end
    ODD: ends in 1
    EVEN: ends in 0

        if(number < 2 ) {
        return Integer.toString(number);
    }
    if(number % 2 == 0){
        return convertNumber(number/2, base) + "0";
    }
        return convertNumber((number-1)/2, base) + "1";
     */

    @Test
    public void shouldReturnString100000Given8Base2() {
        verifyConvertNumber(32,2, Integer.toBinaryString(32));
        System.out.println("Binary version of 32 is " + Integer.toBinaryString(32));
    }

    @Test
    public void shouldPassForRandomNumbersWithBase2() {
        for(int i = 0; i < 199; i ++) {
            int random = (int) (Math.random() * 10000);
            verifyConvertNumber(random, 2, Integer.toBinaryString(random));
//            System.out.println("Binary version of " +Integer.toString(random) +" is " + Integer.toBinaryString(random));
//            System.out.println(String.format("Binary version of %d is %s", random , Integer.toBinaryString(random)));
        }
    }

    @Test
    public void shouldReturn0Given0Base8() {
        verifyConvertNumber(0,8, "0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWithNegativeNumbers() {
        verifyConvertNumber(-5, 2, Integer.toBinaryString(-5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForBaseLessThan2() {
        verifyConvertNumber(2,1, Integer.toBinaryString(2));
    }

    @Test
    public void shouldPassForRandomNumbersWithBase16() {
        for(int i = 0; i < 199; i ++) {
            int random = (int) (Math.random() * 10000);

            verifyConvertNumber(random, 16, Integer.toHexString(random));
//            System.out.println("Binary version of " +Integer.toString(random) +" is " + Integer.toBinaryString(random));
            System.out.println(String.format("Binary version of %d is %s", random , Integer.toHexString(random)));
        }
    }

    /*
    BASE 3

    0 -> 0
    1 -> 1
    2 -> 2
    3 -> 10
    4 -> 11
    5 -> 12
    6 -> 20
    7 -> 21
    8 -> 22
    9 -> 100

base is 2, less than 2 is the same as itself
base is 3, less than 3 is the same as itself

if divisable by 3 then they are the same but add 0, 1 or 2 at the end
     */


    private void verifyConvertNumber(int num, int b, String s) {
        String expected = s;
        String actual = ChangeTheBase.convertNumber(num, b);
        Assert.assertThat(actual, Matchers.equalTo(expected));
    }
}