/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

public class App {
    public static void main(String[] args) {
      LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.palindromeLast(linkedList));
        System.out.println(linkedList.insert(2));
      System.out.println(linkedList.insert(1));
       System.out.println(linkedList);
      LinkedList linkedList2 = new LinkedList();
      linkedList2.append(4);

      System.out.println(linkedList.toString());
      System.out.println(linkedList2.toString());
       System.out.println(linkedList.zipLists2nd(linkedList, linkedList2));
//      System.out.println(linkedList1.toString());

    }
}
