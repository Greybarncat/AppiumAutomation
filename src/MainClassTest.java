import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testLocalNumber ()
    {
        Assert.assertTrue("The number isn't 14",getLocalNumber() == 14);
    }

}
