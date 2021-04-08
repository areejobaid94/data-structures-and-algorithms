package LinkedList;
import Node.Node;
import Errors.Error;
public class LinkedList {
  Node head;
  public LinkedList(Object value){
    this.head = new Node(value);
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
}
