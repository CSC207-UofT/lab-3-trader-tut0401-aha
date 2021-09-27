import org.junit.*;

import static org.junit.Assert.*;


public class TestDog {
    Dog g;

    @Before
    public void setUp() throws Exception {
        g = new Dog();
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
        assertEquals(2, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(1, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(6000, g.getPrice());
    }

}