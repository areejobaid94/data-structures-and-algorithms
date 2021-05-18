package quickSort;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QuickSortTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void quickSortTestEmptyArray() {
        ArrayList array = new ArrayList();
        QuickSort.quickSort(array);
        assertEquals("Test sort empty array","[]" ,array.toString());
        assertEquals("Test sort empty array => size",0 ,array.size());
    }

    @Test public void quickSortTestReverseArrayWithOddLength(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(7);
        array.add(5);
        array.add(3);
        array.add(1);

        QuickSort.quickSort(array);

        assertEquals("Quick Sort Test Reverse Array With Odd Length => test the string value of the output array", "[1, 3, 5, 7, 9]", array.toString());
        assertEquals("Quick Sort Test Reverse Array With Odd Length => test fisrt item after sorting", 1, array.get(0));
        assertEquals("Quick Sort Test Reverse Array With Odd Length => test last item after sorting", 9, array.get(array.size() - 1 ));
    }

    @Test public void quickSortTestReverseArrayWithEvenLength(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(7);
        array.add(5);
        array.add(3);

        QuickSort.quickSort(array);

        assertEquals("Quick Sort Test Reverse Array With Even Length => test the string value of the output array", "[3, 5, 7, 9]", array.toString());
        assertEquals("Quick Sort Test Reverse Array With Even Length => test fisrt item after sorting", 3, array.get(0));
        assertEquals("Quick Sort Test Reverse Array With Even Length => test last item after sorting", 9, array.get(array.size() - 1 ));
    }

    @Test public void quickSortTestArrayWithOneItem(){
        ArrayList array = new ArrayList();
        array.add(9);

        QuickSort.quickSort(array);

        assertEquals("Quick Sort Test Array With One Item", 9, array.get(0));
    }

    @Test public void quickSortTestArrayWithRandomItems(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(6);
        array.add(1);
        array.add(3);
        array.add(10);
        array.add(0);
        array.add(2);
        array.add(4);

        QuickSort.quickSort(array);

        assertEquals("Quick Sort Test Array With Random Items", "[0, 1, 2, 3, 4, 6, 9, 10]", array.toString());
    }

    @Test public void quickSortTestSortedArray(){
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);

        String SortedArrayToStringBefore = array.toString();

        QuickSort.quickSort(array);

        assertEquals("Sorted array before sorting equal Sorted Array after sorting", SortedArrayToStringBefore, array.toString());
    }
}
