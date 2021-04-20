package utilities;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {

    public MultiBracketValidation() {
    }

    public static boolean multiBracketValidation(String input){
        Stack OpenBracket = new Stack();
        HashMap<String, String>  multiBracket = new HashMap<String,String>();
        multiBracket.put("}", "{");
        multiBracket.put("]", "[");
        multiBracket.put(")", "(");
        for (int i = 0; i < input.length(); i++) {
            String chara = Character.toString(input.charAt(i));
            String item = multiBracket.get(chara);
            if(item != null){
                if(OpenBracket.isEmpty() || !item.equals(OpenBracket.pop())){ return false;}
            }else if (chara.equals("(") || chara.equals("{") || chara.equals("[") ){
                OpenBracket.push(chara);
            }
        }
        return OpenBracket.empty();
    }

}
