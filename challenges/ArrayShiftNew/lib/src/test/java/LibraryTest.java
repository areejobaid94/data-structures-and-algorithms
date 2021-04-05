import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        ArrayShift classUnderTest = new ArrayShift();
        System.out.println("test Shift Array Method Test");

        //test Shift Array method solution;
        long[] oddLingthArr = {1,2,6,7};
        long[] evenLingthArr = {1,2,6,7,8};
        long[] emptyArray = {};
        assertEquals(4,classUnderTest.insertShiftArray(oddLingthArr,4)[oddLingthArr.length/2]);
        assertEquals(4,classUnderTest.insertShiftArray(evenLingthArr,4)[evenLingthArr.length/2 +1]);
        assertEquals(4,classUnderTest.insertShiftArray(emptyArray,4)[0]);

        // Insert Shift Delete Array
        assertEquals(4,classUnderTest.insertShiftDeleteArray(oddLingthArr,4)[oddLingthArr.length/2]);
        assertEquals(4,classUnderTest.insertShiftDeleteArray(evenLingthArr,4)[evenLingthArr.length/2 +1]);
    }

}