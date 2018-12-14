import org.junit.Test;
import org.junit.Assert;

public class MatrixTest {
 
    @Test public void testMult() {
        Matrix a = new Matrix(2, 2);
        Matrix b = new Matrix(2, 2);

        a.value[0][0] = 1;
        a.value[1][0] = 2;
        a.value[0][1] = 3;
        a.value[1][1] = 4;

        b.value[0][0] = 1;
        b.value[1][0] = 2;
        b.value[0][1] = 3;
        b.value[1][1] = 4;

        Matrix ab = a.mult(b);

        Matrix c = new Matrix(2, 2);

        c.value[0][0] = 7;
        c.value[1][0] = 10;
        c.value[0][1] = 15;
        c.value[1][1] = 22;

        Assert.assertEquals(c.value, ab.value);
    }
}
