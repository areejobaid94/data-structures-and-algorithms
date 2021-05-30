package LinkedList;
import Errors.Error;
import Node.NodeRightDown;
import Node.Node;

import java.util.ArrayList;

public class LinkedList {
  Node head;
  static int  size;
  public LinkedList(Object value){
    this.head = new Node(value);
    this.size = this.size +1;
  }
  public LinkedList(){
    this.head = null;
  }

  public LinkedList insert(Object value){
    try{
      Node oldHead = this.head;
      this.head = new Node(value);
      if(oldHead != null) {
        this.head.next = oldHead;
      };
    }catch (Exception ex){
      System.out.println(Error.unExpectedError());
    }
    this.size = this.size +1;
    return this;
  };

  public boolean includes(Object value) {
    try {
      Node current = this.head;
      while (current != null) {
        if (current.value == value) return true;
        current = current.next;
      }
    }catch(Exception ex){
      System.out.println(Error.unExpectedError());
    }
    return false;
  }

  public LinkedList append(Object value) {
    try{
      Node node = this.head;
      if (node == null) {
        this.head = new Node(value);
        this.size++;
        return this;
      };
      while (node.next != null)node = node.next;
      node.next = new Node(value);
    }catch (Exception ex){
      System.out.println(Error.unExpectedError());
    }
    this.size = this.size +1;
    return this;
  };


  public LinkedList insertBefore  (Object value,Object newVal){
    try{
      Node node = this.head;
      if(node.value == value){this.head = new Node(newVal);this.head.next = node;return this;}
      while(node.next != null){
        if(node.next.value == value){
          Node nextValue = node.next;
          node.next = new Node(newVal);
          node.next.next = nextValue;
          break;
        };
        node = node.next;
      };
    } catch (Exception ex){
      System.out.println(Error.unExpectedError());
    }
    this.size = this.size +1;
    return this;
  };

  public LinkedList insertAfter(Object value,Object newVal){
    Node node = this.head;
    while(node != null){
      if(node.value == value){
        Node nextValue = node.next;
        node.next = new Node(newVal);
        node.next.next = nextValue;
        break;
      };
      node = node.next;
    };
    this.size = this.size +1;
    return this;
  }

  // Stretch Goal
  public LinkedList deleteNode(Object value){
    try {
      Node current = this.head;
      if(current.value== value){
        head = head.next;
      }else{
        while (current.next != null) {
          if (current.next.value == value){
            current.next = current.next.next;
            break;
          }
          current = current.next;
        }
      }
    }catch(Exception ex){
      System.out.println(Error.unExpectedError());
    }
    this.size = this.size -1;
    return this;
  }

  public String toString() {
    Node current = this.head;
    String str = current != null ? "{ " : "NULL";
    try {
      while (current != null) {
        str += current.next  != null ? current.value + " } -> { " : current.value + " } -> NULL";
        current = current.next;
      };
    }catch (Exception ex){
      System.out.println(Error.unExpectedError());
    }
    return str;
  };

  public Object kthFromEnd(int k){
    Node node = this.head;
    try{
      if(k > this.size - 1 || this.size == 0 || k < 0){return "Exception";}
      k = this.size - k -1;
      int countIn = 0 ;
      while(node != null && k != countIn){
        node = node.next;
        countIn++;
      };
    }catch (Exception ex){
      return Error.Exception();
    }
    return node.value;
  }

  // Stretch Goal
  public Object findMidPoint(){
    Node node = this.head;
    if(node == null) return null;
    try{
      int count = 0;
      while(node != null && (this.size / 2 > count )){
        node = node.next;
        count++;
      };
    }catch (Exception ex){
      return Error.Exception();
    }
    return node.value;
  }
  // first solution.
  public String zipLists(LinkedList list1, LinkedList list2){
    Node list1Current = list1.head;
    Node list2Current = list2.head;
    LinkedList linkedList = new LinkedList();
    while (list1Current != null || list2Current != null){
      if(list1Current != null){
        linkedList.append(list1Current.value);
        list1Current = list1Current.next;
      }
      if( list2Current != null){
        linkedList.append(list2Current.value);
        list2Current = list2Current.next;
      }
    }
    return  linkedList.toString();
  };

  // 2nd solution.
  public String zipLists2nd(LinkedList list1, LinkedList list2){
    Node list1Current = list1.head;
    Node list2Current = list2.head;
    if(list1Current == null ){
      list1.head = list2.head;
      return list1.toString();
    }
    while (list1Current != null && list2Current != null){
      Node list1Node = list1Current.next;
      Node list2Node  = list2Current.next;
      list1Current.next = list2Current;
      list2Current.next = list1Node;
      list1Current = list1Node;
      list2Current = list2Node;
    }
    return list1.toString();
  };

  public boolean palindromeLast(LinkedList list){
    Node node = list.head;
    if(node == null ||(node != null && node.next == null))return false;
    int count = 0;
    ArrayList fromStartToMid =new ArrayList();
    int mid = this.size/2;
    while(node != null && (count < (((int) list.size/2)))){
      if(this.kthFromEnd(count) != this.kthFromEnd(list.size - count -1))return false;
      node = node.next;
      count++;
    };
    return true;
  };
  public LinkedList marge (LinkedList list1, LinkedList list2){
        Node current1 = (Node) list1.head;
        Node current2 = (Node)  list2.head;
        while (current1 != null && current2 != null){
          Node temp = (Node) current1.next;
          current1.next = current2;
          current1 = temp;
          temp =  (Node) current2.next;
          if(current1 != null)
            current2.next = current1;
          current2 = temp;
        }
        return list1;
  }

  static LinkedList addOne(LinkedList linkedList)
  {
    Node head = linkedList.head;
    String numToString = "";
    while (head != null){
      numToString = numToString +head.value;
      head = head.next;
    }
    head = linkedList.head;
    int stringToNum =(Integer.parseInt(numToString))+1;
    numToString = stringToNum + "";
    int count  = 0;
    while (head != null){
      head.value = numToString.charAt(count);
      head = head.next;
      count++;
    }
    return linkedList;
  }




  static Node addOne(Node head)
  {
    String numToString = "";
    Node current = head;
    Node output = head;
    while (current != null){
      numToString = numToString +current.value;
      current = current.next;
    }
    int stringToNum =(Integer.parseInt(numToString))+1;
    numToString = stringToNum + "";
    int count  = 0;
    while (head != null){
      head.value = numToString.charAt(count);
      head = head.next;
      count++;
    }
    return output;
  }

  public static Node reverseK(Node  head, int k ){
      Node  prev = null;
      Node  current = head;
      Node  next = null;
      int count = 0 ;
      k = size - k -1;
      while (current != null &&  count < k)
      {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count ++;
      }
    System.out.println(prev);
    System.out.println(current);
    prev.next = current;
    return prev;
  }

  public static Node swap (Node  head){
    Node  current = head;
    while (current != null && current.next != null)
    {
      Object value = current.value ;
      current.value = current.next.value;
      current.next.value =value;
      current = current.next.next;
    }
    return head;
  }


  public static Node mergeWithSort (Node head1,Node head2){
    Node output = new Node(1);
    Node current = output;
    while(head1 != null && head2 != null)
    {
      if((int)head1.value <= (int)head2.value)
      {
        current.next = head1;
        head1 = head1.next;
      }
      else
      {
        current.next = head2;
        head2 = head2.next;
      }
      current = current.next;
    }
    if(head1 == null) current.next = head1;
    if(head2 == null) current.next = head2;
    return output.next;
  }
};

