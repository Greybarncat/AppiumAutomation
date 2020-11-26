import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testLocalNumber ()
    {
        Assert.assertTrue("The local number =! 14",getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber ()
    {
        Assert.assertTrue("The class number <= 45",getClassNumber() > 45);
    }

    @Test
    public void testGetClassString ()
    {
        Assert.assertTrue ("The class string doesn't contain \"Hello\" or \"hello\"",getClassString().contains("hello") | getClassString().contains("Hello"));
    }
}
