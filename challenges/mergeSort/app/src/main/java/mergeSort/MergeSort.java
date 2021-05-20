package mergeSort;

import java.util.ArrayList;

public class MergeSort {
    public static ArrayList<Object> Mergesort(ArrayList<Object> array){
        int n = array.size();
        if(n > 1){
            int mid = (int) Math.floor(n / 2);
            ArrayList left = new ArrayList(array.subList(0 , mid));
            ArrayList right = new ArrayList(array.subList(mid, array.size()));
            Mergesort(left);
            // sort the right side
            Mergesort(right);
            // merge the sorted left and right sides together
            Merge(left, right, array);
        }
        return array;
    }

    public static void Merge(ArrayList left,ArrayList right,ArrayList arr){
        int i = 0;
        int j = 0;
        int k = 0;

         while( i < left.size() && j < right.size()){
            if((int) left.get(i) <= (int) right.get(j)){
                arr.set(k,left.get(i));
                i = i + 1;
            }
            else{
                arr.set(k,right.get(j));
                j = j + 1;
            }
            k = k + 1;
        }
        if(i == left.size()){
            for(int l = j ; l < right.size() ; l++){
                arr.set(k,right.get(l));
                k++;
            }
        }
        else
        {
            for(int l = i ; l < left.size() ; l++){
                arr.set(k,left.get(l));
                k++;
            }
        }
    }
}
