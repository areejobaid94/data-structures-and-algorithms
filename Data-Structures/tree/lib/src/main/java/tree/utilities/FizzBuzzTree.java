package tree.utilities;

import helpers.Queue;
import org.checkerframework.checker.units.qual.A;
import tree.BinaryTree;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree {
    public static Tree output = new Tree();
    public static Tree fizzBuzzTree(Tree tree){
        if(tree.root == null)return output;
        output.root = new KAnyNode(checkValue(tree.root.value));
        fizzBuzzTree(tree.root,output.root);
        return output;
    }

    public static void fizzBuzzTree(KAnyNode root,KAnyNode outputRoot){
        for (int i = 0; i < root.children.size() ; i++){
            KAnyNode node = new KAnyNode( checkValue(root.children.get(i).value));
            outputRoot.children.add(node);
            fizzBuzzTree(root.children.get(i),outputRoot.children.get(i));
        }
    }

    private static Object checkValue(Object val){
       return ((int)val) % 3 == 0 && ((int)val) % 5 == 0 ?  "FizzBuzz" : ((int)val) % 3 == 0 ? "Fizz" :  ((int)val) % 5 == 0 ? "Buzz": val.toString();
    }


}
