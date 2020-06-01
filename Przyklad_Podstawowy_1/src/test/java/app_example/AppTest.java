package app_example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testSomeMethod()
    {
        App lib = new App();
        assertTrue("Should be true", lib.someMethod(true));
    }
    @Test public void secondTest()
    {
        App lib = new App();
        assertFalse("Should be false", lib.someMethod(false));
    }

}
