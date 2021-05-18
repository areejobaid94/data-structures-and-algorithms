package insertionSort;

import java.util.ArrayList;

public class InsertionSort {
    static public ArrayList<Object> insertionSort(ArrayList<Object> array){
        for (int i = 1 ; i < array.size() ; i++){
            int j = i - 1;
            Object temp = array.get(i);

            while (j >= 0 && (int) temp < (int) array.get(j)){
                array.set((j + 1),array.get(j));
                array.set(j, temp);
                j = j - 1;
            }}
        return array;
    }
}
