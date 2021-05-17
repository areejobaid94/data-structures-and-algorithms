 ```
 Mergesort([100, 20, 3]);
 ArrayList array = new ArrayList();
 array.add(100);
 array.add(20);
 array.add(3);
 System.out.println(MergeSort.Mergesort(array));


 public class MergeSort {
    public static ArrayList<Object> Mergesort(ArrayList<Object> array){

        // Firt phase => n=3 
        // Second phase => n=1
        // Third phase => n=2 
        // fourth phase => n=1       
        // Fifth phase  => n=1
        int n = array.size();

        if(n > 1){
            // Firt phase => mid=1  
            // Second phase => mid=1
            // Third phase => mid=1   
            // fourth phase => mid=1    
            // Fifth phase => mid=1  
            int mid = (int) Math.floor(n / 2);
            
            // Firt phase => left= [100] 
            // Second phase => left= [100]
            // Third phase => left= [20]    
            // fourth phase => left= [20]  
            // Fifth phase  => left= [20]  
            ArrayList left = new ArrayList(array.subList(0 , mid));


            // Firt phase => right= [20, 3] 
            // Second phase => right= [20, 3]
            // Third phase => right= [3]
            // fourth phase => right= [3]   
            // Fifth phase  => right= [3] 
            ArrayList right = new ArrayList(array.subList(mid, array.size()));

            Mergesort(left);

            // sort the right side
            Mergesort(right);

            // merge the sorted left and right sides together
            Merge(left, right, array);
        }
        return array;
    }

    //////////////Start From Phase Five /////////////
    public static void Merge(ArrayList left,ArrayList right,ArrayList arr){


        // Fifth phase  => i = 0
        // Fifth phase  => j = 0
        // Fifth phase  => k = 0
        int i = 0;
        int j = 0;
        int k = 0;

        while( i < left.size() && j < right.size()){
            // Fifth phase  => i = 0
            // Fifth phase  => j = 0 
            // Fifth phase  => k = 0
            if((int) left.get(i) <= (int) right.get(j)){
                arr.set(k,left.get(i));
                i = i + 1;
            }
            else{
                // Fifth phase  => arr[0] = 3    
                arr.set(k,right.get(j));

                // Fifth phase  => j = 1     
                j = j + 1;
            }

            // Fifth phase  => k = 1   
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