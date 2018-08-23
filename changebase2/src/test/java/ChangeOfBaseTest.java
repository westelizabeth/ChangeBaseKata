import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ChangeOfBaseTest {
    /*
    create method in ChangeOfBase Class
    only throw exception
     */
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfBaseIsBelowTwo() {
        ChangeOfBase.convert(10, 1);
    }

    /*
    if base == 10 -> "10"
     */
    @Test
    public void shouldReturnStringTenGivenTenBaseTen() {
        verifyConvert(10, 10, "10");
    }

    /*
    return "30"
     */
    @Test
    public void shouldReturnStringThrityGivenThirtyBaseTen() {
        verifyConvert( 30, 10, "30");
    }

    /*
    refactor return Integer.toString(num);
    also refactor to verifyConvert
     */


    /*
    green lights -hmmmm
     */
    @Test
    public void shouldReturnString1Given1Base2() {
        verifyConvert( 1, 2, "1");
    }

    /*
    add lots of if statements
     */
    @Test
    public void shouldReturnString10Given2Base2() {
        verifyConvert(2,2,"10");
    }

    @Test
    public void shouldReturnString11Given3Base2() {
        verifyConvert(3,2,"11");
    }

    @Test
    public void shouldReturnString100Given4Base2() {
        verifyConvert(4,2,"100");
    }

    /*
    see pattern- start dividing
    even ends in 0 odd ends in 1
    */



    private void verifyConvert( int num, int base, String s) {
        String expected = s;
        String actual = ChangeOfBase.convert(num, base);
        Assert.assertThat(actual, Matchers.equalTo(expected));
    }

}