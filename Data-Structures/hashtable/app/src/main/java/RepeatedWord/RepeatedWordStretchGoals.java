package RepeatedWord;

import hashtable.Hashtable;

public class RepeatedWordStretchGoals {
    public static String getCountOfWords(String text){
        Hashtable hashtable = new Hashtable();
        String output = "counts: ";
        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++){
            Object word = hashtable.get(stringArray[i]);
            if(word != null){
                int count = (int) word + 1;
                hashtable.add(stringArray[i],count);
            }else{
                hashtable.add(stringArray[i],1);
            }
        }
        for (int i = 0; i < stringArray.length; i++){
            int count = (int)hashtable.get(stringArray[i]) ;
            if(count != -1){
                output += "" + stringArray[i] +"=>"  + count +" ";
                hashtable.add(stringArray[i],-1);
            }
        }
        return output;
    }

    public static String getMostFrequentlyUsed(String text){
        Hashtable hashtable = new Hashtable();
        String output = "counts: ";
        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++){
            Object word = hashtable.get(stringArray[i]);
            if(word != null){
                int count = (int) word + 1;
                hashtable.add(stringArray[i],count);
            }else{
                hashtable.add(stringArray[i],1);
            }
        }
        for (int i = 0; i < stringArray.length; i++){
            int count = (int)hashtable.get(stringArray[i]) ;
            if(count > 1){
                output += "" + stringArray[i] +"=>"  + count +" ";
                hashtable.add(stringArray[i],-1);
            }
        }
        return output;
    }
}
