 ```
 Mergesort([100, 20, 3]);
 ArrayList array = new ArrayList();
 array.add(100);
 array.add(20);
 array.add(3);
 System.out.println(MergeSort.Mergesort(array));

 function Mergesort(arr){
  let n =arr.length;
  // Firt phase => n=3 
  // Second phase => n=1
  // Third phase => n=2 
  // fourth phase => n=1       
  // Fifth phase  => n=1

  if(n > 1){
    let mid =  Math.floor(n / 2);
  // Firt phase => mid=1  
  // Second phase => mid=1
  // Third phase => mid=1   
  // fourth phase => mid=1    
  // Fifth phase => mid=1  

    let left = arr.slice(0 , mid);
  // Firt phase => left= [100] 
  // Second phase => left= [100]
  // Third phase => left= [20]    
  // fourth phase => left= [20]  
  // Fifth phase  => left= [20]  

    let right = arr.slice(mid);
  // Firt phase => right= [20, 3] 
  // Second phase => right= [20, 3]
  // Third phase => right= [3]
  // fourth phase => right= [3]   
  // Fifth phase  => right= [3]   

    Mergesort(left);
    // sort the right side
    Mergesort(right);
    // merge the sorted left and right sides together
    Merge(left, right, arr);
  }
  return arr;
}
//////////////start from phase 5 /////////////
function Merge(left, right, arr){
  // Fifth phase  => right= [3] 
  // Fifth phase  => left= [20]   
  // Fifth phase  => arr= [20, 3]
  let i = 0;
  let j = 0;
  let k = 0;

  
  // Fifth phase  => i = 0
  // Fifth phase  => j = 0
  // Fifth phase  => k = 0

  while( i < left.length && j < right.length){
    // Fifth phase  => i = 0
    // Fifth phase  => j = 0 
    // Fifth phase  => k = 0

    if(left[i] <= right[j]){         
      arr[k] = left[i];
       i = i + 1;
     }
    else{
      arr[k] = right[j];
    // Fifth phase  => arr[0] = 3    

      j = j + 1;
    // Fifth phase  => j = 1     

    }      
    k = k + 1;
    // Fifth phase  => k = 1   
  }
  if(i == left.length){
    for(let l = j ; l < right.length ; l++){
      arr[k] =  right[l];
      k++;
    }
  }
  else
  {
    for(let l = i ; l < left.length ; l++){
      arr[k] =  left[l];
      k++;
    }
  }
}
