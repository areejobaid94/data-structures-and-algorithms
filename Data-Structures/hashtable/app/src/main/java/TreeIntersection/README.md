# Challenge Summary
* Write a function called tree_intersection that takes two binary tree parameters.
* Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.
## Whiteboard Process
![](./img/lab32.png)
[Link](https://docs.google.com/drawings/d/1q_BQ10IiLeRI4ySWByW_nF8EiEQaKwMBbE_ZW0aQVCk/edit?usp=sharing)

## Approach & Efficiency
Big O => O(n), we just have Recreation loop.
Space comp => O(n^2), we added a hashmap and arraylist.

## Solution
```
public class RepeatedWord {
    public static String getFirstRepeatedWord(String text){
        Hashtable hashtable = new Hashtable();
        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++){
            Object word = hashtable.get(stringArray[i]);
            if(word != null){
                return stringArray[i];
            }else{
                 hashtable.add(stringArray[i],1);
            }
        }
        return "";
    }
```