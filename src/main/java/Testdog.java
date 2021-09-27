import org.junit.*;

import static org.junit.Assert.*;


public class Testdog {
    dog g;

    @Before
    public void setUp() throws Exception {
        g = new dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", g.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        g.upgradeSpeed();
        assertEquals(1, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(0, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(6000, g.getPrice());
    }

}