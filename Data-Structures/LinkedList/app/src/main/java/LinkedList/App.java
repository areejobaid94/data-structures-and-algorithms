/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import Node.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
<<<<<<< HEAD
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
=======
       linkedList.append(5);
        linkedList.append(7);
        System.out.println(deleteTheValue(linkedList,5));
//        LinkedList linkedList2 = new LinkedList();
//        linkedList2.append(2);
//        linkedList2.append(4);
//        linkedList2.append(8);
//        System.out.println(linkedList.marge(linkedList,linkedList2));
//        ArrayList<Object> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(8);
//        System.out.println(App.binarySearch(1,arrayList));
        int[] nums = {2,2,1,2,0,1,2,1,0,2,1,0,2,1,0};
        System.out.println(Arrays.toString(sortZeroOneTwo(nums)));
>>>>>>> b827983cb471c677df7a032c68e5ee57a04b0f85
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

    public static int[] sortZeroOneTwo(int[] array){
        int zeroIndex = 0;
        int twoIndex = array.length - 1;
        for(int i  = 0;i < array.length; i++){
            int item = array[i];
            if(item == 0 ){
                array[i] = array[zeroIndex];
                array[zeroIndex] = item;
                zeroIndex++;
            }
            else if(array[i]  == 2 && i < twoIndex){
                array[i] = array[twoIndex];
                array[twoIndex] = item;
                i = i - 1;
                twoIndex--;
            }
        }
        return array;
    }




    public static LinkedList deleteTheValue(LinkedList linkedList, int value){
        Node current=  linkedList.head;
        while (current != null && current.next != null){
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
