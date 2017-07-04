import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by a615484 on 04-07-2017.
 */
public class MyTest {
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        MyClass tester = new MyClass();
        tester.multiply(1000, 5);
    }

    @Test
    public void testMultiply() {
        MyClass tester = new MyClass();
        assertEquals ("10/ 5 must be 2", 2, tester.multiply(10, 5));
    }
}
