import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Method getLocalNumber returned !14",mainClass.getLocalNumber() == 14);
    }
}