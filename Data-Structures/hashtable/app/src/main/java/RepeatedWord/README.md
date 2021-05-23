# Challenge Summary
* Write a function that accepts a lengthy string parameter.
* Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Whiteboard Process
[Link](https://docs.google.com/drawings/d/1q_BQ10IiLeRI4ySWByW_nF8EiEQaKwMBbE_ZW0aQVCk/edit?usp=sharing)

## Approach & Efficiency
Big O => O(n), we just have for loop
Space comp => O(n), we added a hashmap

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