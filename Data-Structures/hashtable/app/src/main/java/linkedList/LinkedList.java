package linkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
    }

    public Node head;

    public LinkedList() {
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
            System.out.println(ex);
        }
        return this;
    };
    public String toString() {
        Node curent = this.head;
        String linkedListValues = "";
        while (curent != null) {
            linkedListValues = linkedListValues + "{" + curent.val + "}->";

            curent = curent.next;

        }
        return linkedListValues + "Null";
    }


    public void append(Object val) {
        Node appendedNode = new Node(val);
        Node currentNode = head;
        if (head == null) {
            head = appendedNode;
        } else {
            while (currentNode.next != null) {

                currentNode = currentNode.next;
            }
            currentNode.next = appendedNode;
        }
    }
}