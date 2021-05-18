```
ArrayList array = new ArrayList();
array.add(9);
array.add(0);
array.add(1);
array.add(4);
InsertionSort.insertionSort(array);

public class InsertionSort {
    static public ArrayList<Object> insertionSort(ArrayList<Object> array){
        // Firt pass => array = [9,0,1,4]
        for (int i = 1 ; i < array.size() ; i++){
            // Firt pass => i = 1
            // Second pass => i = 2
            // Third pass => i = 3 

            int j = i - 1;
            // Firt pass => j = 0
            // Second pass => j = 1
            // Third pass => j = 2 

            Object temp = array.get(i);
            // Firt pass => temp = 9
            // Second pass => temp = 0
            // Third pass => temp = 1 

            while (j >= 0 && (int) temp < (int) array.get(j)){
                // Firt pass => j = 0, temp = 0, arr = (4) [0, 9, 1, 4]
                // Second pass => j = 1, temp = 1, arr = (4) [0, 9, 1, 4]
                // Third pass => j = 2, temp = 4, arr = (4) [0, 1, 9, 4]

                array.set((j + 1),array.get(j));
                // Second pass => temp = 1
                // Third pass => temp = 4

                array.set(j, temp);
                j = j - 1;
            }}
        return array;
    }
}

```