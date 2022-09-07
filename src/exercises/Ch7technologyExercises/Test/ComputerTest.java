package exercises.Ch7technologyExercises.Test;

import exercises.Ch7technologyExercises.Main.Computer;
import exercises.Ch7technologyExercises.Main.Laptop;
import exercises.Ch7technologyExercises.Main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ComputerTest {
    private Computer testComp;
    private Laptop testLaptop;
    private SmartPhone testPhone;
    @Before
    public void createTestComputer() {
        testComp = new Computer("apple", "macbook air", 16,256);
        testLaptop = new Laptop("apple", "macbook pro", 8, 500, 2, 11.4, false);
        testPhone = new SmartPhone("apple", "iPhone 8", 16,128,24, 7);
    }
        @Test
        public void testComputerConstructor() {
            assertEquals("apple", testComp.getCompany());
            assertEquals("macbook air", testComp.getModel());
            assertEquals(16, testComp.getGigsOfRam());
            assertEquals(256, testComp.getGigsOfMemory());
        }

        @Test
    public void testLaptopConstructor() {
            assertEquals("apple", testLaptop.getCompany());
            assertEquals("macbook pro", testLaptop.getModel());
            assertEquals(8, testLaptop.getGigsOfRam());
            assertEquals(500, testLaptop.getGigsOfMemory());
            assertEquals(2, testLaptop.getNumberOfPorts());
            assertEquals(11.4, testLaptop.getScreenSizeIn(),.001);
            assertFalse(testLaptop.isHas10Key());
        }

        @Test
    public void testSmartphoneConstructor() {
            assertEquals("apple", testPhone.getCompany());
            assertEquals("iPhone 8", testPhone.getModel());
            assertEquals(16, testPhone.getGigsOfRam());
            assertEquals(128, testPhone.getGigsOfMemory());
            assertEquals(24, testPhone.getGigsPerMonth());
            assertEquals(7, testPhone.getHoursBatteryLife());
        }
}

