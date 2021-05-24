package TreeIntersection;

import hashtable.Hashtable;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;

public class TreeIntersectionStretchGoals {

    //Solution Without Hashtable
    public static ArrayList tree_intersection(BinaryTree tree1, BinaryTree tree2){
        ArrayList tree1Item = treeToList(tree1.root);
        ArrayList output = new ArrayList();
        for (int i = 0 ; i < tree1Item.size();i++){
            if(tree2.contains(tree1Item.get(i))){
                output.add(tree1Item.get(i));
            }
        }
        return output;
    }

    public static ArrayList treeToList(Node root){
        ArrayList list = new ArrayList();
        try {
            if (root.left != null)
                list.addAll(treeToList(root.left));
            list.add(root.value);
            if (root.right != null)
                list.addAll(treeToList(root.right));
        }catch (Exception ex){
            System.out.println(ex);
        }
        return list;
    }
}
