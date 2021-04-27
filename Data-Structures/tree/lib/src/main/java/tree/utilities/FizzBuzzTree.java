package tree.utilities;

import helpers.Queue;
import org.checkerframework.checker.units.qual.A;
import tree.BinaryTree;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree {

    public static ArrayList fizzBuzzTree(Tree tree){
        ArrayList output = new ArrayList();
        if(tree.root == null)return output;
        output.addAll(fizzBuzzTree(tree.root,output));
        return output;
    }

    public static ArrayList fizzBuzzTree(KAnyNode root,ArrayList output){
        for (int i = 0; i < root.children.size() ; i++){
            output.add(checkValue(fizzBuzzTree(root.children.get(i),output)));

        }
        return output;
    }

    private static Object checkValue(Object val){
       return ((int)val) % 3 == 0 && ((int)val) % 5 == 0 ?  "FizzBuzz" : ((int)val) % 3 == 0 ? "Fizz" :  ((int)val) % 3 == 0 ? "Buzz": val;
    }


}
