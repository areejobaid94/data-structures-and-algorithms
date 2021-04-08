import BinarySearch.BinarySearch;
import org.junit.Test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTest {
  @Test
  public void testBinarySearch() {
    long[] newArr = {2,4,6,7};
    long[] newArrOddLen = {2,4,6};
    long[] newArrEmpty = {};

    System.out.println("test binary search first solution");
    BinarySearch classUnderTest = new BinarySearch();
    assertEquals(1,classUnderTest.BinarySearch(newArr,4));
    assertEquals(0,classUnderTest.BinarySearch(newArrOddLen,2));
    assertEquals(2,classUnderTest.BinarySearch(newArr,6));
    assertEquals(-1,classUnderTest.BinarySearch(newArrOddLen,1));
    assertEquals(-1,classUnderTest.BinarySearch(newArrEmpty,1));
    assertEquals(-1,classUnderTest.BinarySearch(newArrEmpty,9));
    assertEquals(-1,classUnderTest.BinarySearch(newArrEmpty,11));
    assertEquals(-1 ,classUnderTest.BinarySearch(newArr,1));
    assertEquals(-1 ,classUnderTest.BinarySearch(newArr,9));


    System.out.println("\n test binary search 2nd solution");
    assertEquals(1,classUnderTest.BinarySearch2ndSol(newArr,4));
    assertEquals(0,classUnderTest.BinarySearch2ndSol(newArrOddLen,2));
    assertEquals(2,classUnderTest.BinarySearch2ndSol(newArr,6));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArrOddLen,1));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArrEmpty,1));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArrEmpty,9));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArrOddLen,9));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArr,9));
    assertEquals(-1,classUnderTest.BinarySearch2ndSol(newArr,1));

  }
}
