package stacksandqueues;

public class MaxStack extends Stack {
    public MaxStack() {
        super();
    }

    @Override
    public String toString() {
        return "MaxStack{" +
                "top=" + top.toString() +
                '}';
    }

    @Override
    public void push(Object value) {
        try {
            Node node = new Node(value);
            if(top == null){
                top = node;
            }else if ((int)top.value < (int) value) {
                super.push(value);
            }else {
                Node current =  top;
                if(current.next != null){
                    while (current.next != null && (int) current.next.value > (int) value){
                        current = current.next;
                    }
                    node.next = current.next;
                    current.next = node;
                }else {
                    current.next = node;
                }
            }

        }catch (Exception ex){
            System.out.println(ex);
        };
    }
//    @Override
    public Object getMax(){
        return this.peek();
    }

}
