import org.junit.Test;
import org.junit.Assert;

public class CalendarTest {
    @Test public void test() throws Exception {
        Calendar cal = new Calendar();
        Assert.assertEquals(cal.computeWeekday(21, 7, 1969), "Montag");
    }
}
