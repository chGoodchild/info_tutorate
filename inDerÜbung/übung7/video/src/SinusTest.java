import org.junit.Test;
import org.junit.Assert;

public class SinusTest {
    @Test public void test() throws Exception {
        Sinus sinus = new Sinus();
        // Assert.assertTrue((sinus.sin(5) == Math.sin(5)));
        Assert.assertTrue((Math.abs(sinus.sin(5) - Math.sin(5)) < 1e-7));
    }

    @Test public void test2() throws Exception {
        Sinus sinus = new Sinus();
        Assert.assertTrue((Math.abs(sinus.sin(Math.PI) - Math.sin(Math.PI)) < 1e-7));
    }

    @Test public void test3() throws Exception {
        Sinus sinus = new Sinus();
        Assert.assertTrue((Math.abs(sinus.sin(-Math.PI) - Math.sin(-Math.PI)) < 1e-7));
    }


        @Test public void test4() throws Exception {
        Sinus sinus = new Sinus();
        // for(long i = Long.MIN_VALUE; i <= Long.MAX_VALUE; i = i + (Long.MAX_VALUE / 2000)) {
        for (int i = -5; i <= 5; i++) {
            Assert.assertTrue((Math.abs(sinus.sin(i) - Math.sin(i)) < 1e-7));
        }
    }

}
