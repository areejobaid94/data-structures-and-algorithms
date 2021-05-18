 ```
 Mergesort([100, 20, 3]);
 ArrayList array = new ArrayList();
 array.add(100);
 array.add(20);
 array.add(3);
 System.out.println(MergeSort.Mergesort(array));


 public class MergeSort {
    public static ArrayList<Object> Mergesort(ArrayList<Object> array){

        // Firt pass => n=3 
        // Second pass => n=1
        // Third pass => n=2 
        // fourth pass => n=1       
        // Fifth pass  => n=1
        int n = array.size();

        if(n > 1){
            // Firt pass => mid=1  
            // Second pass => mid=1
            // Third pass => mid=1   
            // fourth pass => mid=1    
            // Fifth pass => mid=1  
            int mid = (int) Math.floor(n / 2);
            
            // Firt pass => left= [100] 
            // Second pass => left= [100]
            // Third pass => left= [20]    
            // fourth pass => left= [20]  
            // Fifth pass  => left= [20]  
            ArrayList left = new ArrayList(array.subList(0 , mid));


            // Firt pass => right= [20, 3] 
            // Second pass => right= [20, 3]
            // Third pass => right= [3]
            // fourth pass => right= [3]   
            // Fifth pass  => right= [3] 
            ArrayList right = new ArrayList(array.subList(mid, array.size()));

            Mergesort(left);

            // sort the right side
            Mergesort(right);

            // merge the sorted left and right sides together
            Merge(left, right, array);
        }
        return array;
    }

    //////////////Start From pass Five /////////////
    public static void Merge(ArrayList left,ArrayList right,ArrayList arr){


        // Fifth pass  => i = 0
        // Fifth pass  => j = 0
        // Fifth pass  => k = 0
        int i = 0;
        int j = 0;
        int k = 0;

        while( i < left.size() && j < right.size()){
            // Fifth pass  => i = 0
            // Fifth pass  => j = 0 
            // Fifth pass  => k = 0
            if((int) left.get(i) <= (int) right.get(j)){
                arr.set(k,left.get(i));
                i = i + 1;
            }
            else{
                // Fifth pass  => arr[0] = 3    
                arr.set(k,right.get(j));

                // Fifth pass  => j = 1     
                j = j + 1;
            }

            // Fifth pass  => k = 1   
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
```