import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ChangeBaseTest {
    @Test
    public void shouldReturnString0Given0Base10() {
        verifyConvertNumber( 0, 10, "0");
    }

    @Test
    public void shouldReturnString0Given0Base2() {
        verifyConvertNumber( 0, 2, "0");
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

    @Test
    public void shouldReturnString101Given5Base2() {
        verifyConvertNumber(5,2,"101");
    }

    @Test
    public void shouldReturnString110Given6Base2() {
        verifyConvertNumber(6,2,"110");
    }

    @Test
    public void shouldReturnString111Given7Base2() {
        verifyConvertNumber(7,2,"111");
    }

    @Test
    public void shouldReturnString1000Given8Base2() {

        verifyConvertNumber(8,2,"1000");
    }
    @Test
    public void shouldPassForRandomNumberBase2() {
        int random = (int)(Math.random() *100000);
        verifyConvertNumber(random, 2, Integer.toBinaryString(random));
        System.out.println(String.format("random number %d -base 2 %s", random, Integer.toBinaryString(random)));
    }


    private void verifyConvertNumber(int number, int base, String s
    ) {
        String expected = s;
        String actual = ChangeBase.convertNumber(number, base);
        Assert.assertThat(actual, Matchers.equalTo(expected));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeNumbers() {
        verifyConvertNumber(-5, 2, Integer.toBinaryString(-5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForBaseLessThan2() {
        verifyConvertNumber(4,1,"");
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
            9 -> 100*/
}
