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

  public LinkedList append(Object value) {
    try{
      Node node = this.head;
      if (node == null) {
        this.head = new Node(value);
        return this;
      };
      while (node.next != null)node = node.next;
      node.next = new Node(value);
    }catch (Exception ex){
      System.out.println(Error.unExpectedError());
    }
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
    return this;
  }

  public LinkedList deleteNode(Object value){
    try {
      Node current = this.head;
      while (current.next != null) {
        if (current.next.value == value){
          current.next = current.next.next;
          break;
        }
        current = current.next;
      }
    }catch(Exception ex){
      System.out.println(Error.unExpectedError());
    }
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
}
