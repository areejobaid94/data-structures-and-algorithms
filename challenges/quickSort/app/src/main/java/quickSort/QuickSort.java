package quickSort;

import java.util.ArrayList;

public class QuickSort {
    static public ArrayList quickSort(ArrayList arr, int left, int right){
        if (left < right){
            int position = Partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
        return arr;
    }
    static public ArrayList quickSort(ArrayList arr){
        if (arr.size() - 1 > 0){
            int position = Partition(arr,  0,arr.size() -1);
            quickSort(arr, 0, position - 1);
            quickSort(arr, position + 1, arr.size() -1);
        }
        return arr;
    }

    static private int Partition(ArrayList arr, int left,int right){
        // set a pivot value as a point of reference
        Object pivot = arr.get(right);
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left - 1;
        for (int i = left ; i < right ; i++){
            if ((int)arr.get(i)  <= (int)pivot){
                low++;
                Swap(arr, i, low);
            }
        }

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
        Swap(arr, right, low + 1);
        // return the pivot index point
        return low + 1;
    }
    static private void Swap(ArrayList arr,int i,int low){
        Object temp;
        temp = arr.get(i);
        arr.set(i, arr.get(low));
        arr.set(low, temp);
    }
}
