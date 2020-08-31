package tests.junit;

import sessions.JavaMethods.Converter;
import org.junit.Assert;
import org.junit.Test;

public class TestConverter {
    @Test
    public void test1() {

        Converter c = new Converter();
        int f = (int) c.convertCtoF(30);

        //first put expected result, second actual result from the method
        Assert.assertEquals(86,f);

    }
    @Test
    public void testKilometres(){
        Converter c = new Converter();
        int km = (int)c.convertMileToKm(100);
    }

}
