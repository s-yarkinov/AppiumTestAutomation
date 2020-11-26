import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Method getLocalNumber returned !14", mainClass.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Method testGetClassNumber returned value < 45", mainClass.getClassNumber() > 45);
    }
}
