import org.junit.Test;
import org.junit.Assert;

public class GeometryTest {
	
    @Test public void testGeometry() {		
        Rectangle r1 = new Rectangle(3, 6);
        Square s1 = new Square(3);
		
        GeometricObjectList liste = new GeometricObjectList();
        liste.add(r1);
        liste.add(s1);
		
        //Assert.assertEquals(expected, actual, delta);
		
        Assert.assertEquals(27, liste.areaSum(), 0);
        Assert.assertEquals(30, liste.circumferenceSum(), 0);
    }
}
