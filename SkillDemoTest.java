import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplyTest()
    {
        assertEquals(16, SkillDemo.multiply(4, 4));
    }
}
