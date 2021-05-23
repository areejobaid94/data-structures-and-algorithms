package RepeatedWord;


import hashtable.Hashtable;

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
}
