import org.junit.Test;
import org.junit.Assert;

public class CalendarTest {
    @Test public void test() {
        Calendar cal = new Calendar();
        Assert.assertEquals(cal.computeWeekday(21, 7, 1969), "Montag");
    }


    @Test public void test1() {
        Calendar cal = new Calendar();
        int day = 15;
        int mon = 6;
        int year = 2016;

        day = 20;
        Assert.assertEquals(cal.computeWeekday(day, mon, year), "Montag");
    }

    @Test public void test2() {
        Calendar cal = new Calendar();
        int day = 15;
        int mon = 6;
        int year = 2016;

        day = 8;
        Assert.assertEquals(cal.computeWeekday(day, mon, year), "Mittwoch");
    }

    @Test public void test3() {
        Calendar cal = new Calendar();
        int day = 15;
        int mon = 6;
        int year = 2016;

        day = 13;
        Assert.assertEquals(cal.computeWeekday(day, mon, year), "Montag");
    }

    @Test public void test4() {
        Calendar cal = new Calendar();
        int day = 15;
        int mon = 6;
        int year = 2016;

        mon = 7;
        Assert.assertEquals(cal.computeWeekday(day, mon, year), "Freitag");
    }
}
