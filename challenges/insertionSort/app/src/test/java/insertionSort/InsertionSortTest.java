package insertionSort;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InsertionSortTest {
    @Test public void insertionSortTestEmptyArray() {
        ArrayList array = new ArrayList();
        InsertionSort.insertionSort(array);
        assertEquals("Test sort empty array","[]" ,array.toString());
        assertEquals("Test sort empty array => size",0 ,array.size());
    }

    @Test public void insertionSortTestReverseArrayWithOddLength(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(7);
        array.add(5);
        array.add(3);
        array.add(1);

        InsertionSort.insertionSort(array);

        assertEquals("Insertion Sort Test Reverse Array With Odd Length => test the string value of the output array", "[1, 3, 5, 7, 9]", array.toString());
        assertEquals("Insertion Sort Test Reverse Array With Odd Length => test fisrt item after sorting", 1, array.get(0));
        assertEquals("Insertion Sort Test Reverse Array With Odd Length => test last item after sorting", 9, array.get(array.size() - 1 ));
    }

    @Test public void insertionSortTestReverseArrayWithEvenLength(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(7);
        array.add(5);
        array.add(3);

        InsertionSort.insertionSort(array);

        assertEquals("Insertion Sort Test Reverse Array With Even Length => test the string value of the output array", "[3, 5, 7, 9]", array.toString());
        assertEquals("Insertion Sort Test Reverse Array With Even Length => test fisrt item after sorting", 3, array.get(0));
        assertEquals("Insertion Sort Test Reverse Array With Even Length => test last item after sorting", 9, array.get(array.size() - 1 ));
    }

    @Test public void insertionSortTestArrayWithOneItem(){
        ArrayList array = new ArrayList();
        array.add(9);

        InsertionSort.insertionSort(array);

        assertEquals("insertion Sort Test Array With One Item", 9, array.get(0));
    }

    @Test public void mergeSortTestArrayWithRandomItems(){
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(6);
        array.add(1);
        array.add(3);
        array.add(10);
        array.add(0);
        array.add(2);
        array.add(4);

        InsertionSort.insertionSort(array);

        assertEquals("Insertion Sort Test Array With Random Items", "[0, 1, 2, 3, 4, 6, 9, 10]", array.toString());
    }

    @Test public void mergeSortTestSortedArray(){
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

        InsertionSort.insertionSort(array);

        assertEquals("Sorted array before sorting equal Sorted Array after sorting", SortedArrayToStringBefore, array.toString());
    }
}
