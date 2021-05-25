# Challenge Summary
* Write a function that LEFT JOINs two hashmaps into a single data structure.
* The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
* The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
* Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
* The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
* Avoid utilizing any of the library methods available to your language.

## Whiteboard Process
![](./img/lab33.png)
[Link](https://docs.google.com/drawings/d/16uLCbpeb12MmCVv4xmE9lqr9JVBc5djFsyKiGTuxsiY/edit?usp=sharing)

## Approach & Efficiency
Big O => O(n^2), we have for and while loop.
Space comp => O(n^2), we added 2 arraylist.

## Solution
```   
  public static ArrayList leftJoin(Hashtable leftHashtable,Hashtable rightHashtable){
        ArrayList output = new ArrayList();
        for(int i = 0 ; i < leftHashtable.getHashNodesList().length ;i++){
            if(leftHashtable.getHashNodesList()[i] != null){
                Node current =((LinkedList) leftHashtable.getHashNodesList()[i]).head;
                ArrayList inOutput = new ArrayList();
                while (current != null){
                    HashTableNode node =  ((HashTableNode) current.val);
                    inOutput = new ArrayList();
                    inOutput.add(node.getKey());
                    inOutput.add(node.getValue());
                    inOutput.add(rightHashtable.get(node.getKey()));
                    current = current.next;
                }
                output.add(inOutput);
            }
        }
        return output;
    }
```