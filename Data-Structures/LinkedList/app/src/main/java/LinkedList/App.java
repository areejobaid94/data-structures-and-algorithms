/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import Node.Node;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(9);
        linkedList.append(11);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(1);
        linkedList2.append(2);
        linkedList2.append(4);
        linkedList2.append(6);
        linkedList2.append(8);
        linkedList2.append(10);
//        System.out.println(LinkedList.addOne(linkedList));
////        System.out.println(LinkedList.addOne(linkedList.head));
//        System.out.println(LinkedList.reverseK(linkedList.head,2));
//        System.out.println(linkedList);
//        System.out.println(LinkedList.swap(linkedList.head));
        System.out.println(LinkedList.mergeWithSort(linkedList.head, linkedList2.head));
//        System.out.println(linkedList);
    }

    public static int binarySearch(Object ele, ArrayList<Object> array){
        int start = 0;
        int end = array.size() - 1;
        while (start <= end){
            int mid =start + ( end - start) / 2;
            if(array.get(mid) == ele)return mid;
            if((int) ele < (int) array.get(mid)){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static LinkedList deleteTheValue(LinkedList linkedList, int value){
        Node current=  linkedList.head;
        while (current.next != null){
            if((int)current.next.value == value){
                current.next = current.next.next;
            }
            current = current.next;
        }
        if(linkedList.head != null &&(int) linkedList.head.value == value){
            linkedList.head = linkedList.head.next;
        }
        return linkedList;
    }
}
