/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import LeftJoin.LeftJoin;
import LeftJoin.JoinStretchGoals;
import RepeatedWord.RepeatedWord;

import RepeatedWord.RepeatedWordStretchGoals;
import TreeIntersection.TreeIntersectionStretchGoals;
import tree.BinaryTree;
import TreeIntersection.TreeIntersection;

import java.util.HashMap;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        System.out.println(RepeatedWord.getFirstRepeatedWord("arje n a n"));
//        System.out.println(RepeatedWordStretchGoals.getCountOfWords("arje n a n a a"));
//        System.out.println(RepeatedWordStretchGoals.getMostFrequentlyUsed("arje n a n a a"));
//        BinaryTree binaryTree1 = new BinaryTree();
//        binaryTree1.add(1);
//        binaryTree1.add(2);
//        binaryTree1.add(3);
//        binaryTree1.add(4);
//        binaryTree1.add(5);
//        binaryTree1.add(6);
//        binaryTree1.add(7);
//
//
//        BinaryTree binaryTree2 = new BinaryTree();
//        binaryTree2.add(1);
//        binaryTree2.add(2);
//        binaryTree2.add(3);
//        binaryTree2.add(10);
//        binaryTree2.add(7);
//        binaryTree2.add(20);
//
//        System.out.println(TreeIntersection.tree_intersection(binaryTree1,binaryTree2));
//        System.out.println(TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2));
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableLeft.put("areej",0);
        hashtableLeft.put("areej1",1);
        hashtableLeft.put("areej2",2);
        hashtableLeft.put("areej3",3);

        hashtableRight.put("areej",10);
        hashtableRight.put("areej1",20);
        hashtableRight.put("areej2",30);
        hashtableRight.put("areej6",30);

        System.out.println(LeftJoin.leftJoin(hashtableLeft,hashtableRight));
        System.out.println(JoinStretchGoals.join(hashtableLeft, hashtableRight,"r"));
        System.out.println(JoinStretchGoals.join(hashtableLeft, hashtableRight,"l"));
        System.out.println(JoinStretchGoals.join(hashtableLeft, hashtableRight,""));
    }
}
