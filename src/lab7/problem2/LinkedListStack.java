package lab7.problem2;

public class LinkedListStack {
    Node top;
    public int size = 0;

    class Node {
        Integer data;
        Node next;
        Node prev;

        Node(Integer dt){
            data = dt;
        }
    }

    public void push(Integer num) {
        if(num == null) return;
        Node newNode = new Node(num);
        if(top == null){ // stack is empty
            top = newNode;
        }
        else {
            top.next = newNode;
            newNode.prev = top;
            top = newNode;
        }
        size++;
    }

    public Integer peek() {
        if(top == null) return null;
        return top.data;
    }

    public Integer pop(){
        if(top == null) return null;
        Integer ret = top.data;
        if(size > 1){
            top.prev.next = null;
            top = top.prev;
        }else {
            top = null;
        }
        size--;
        return ret;
    }
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[ ");
        Node current = top;
        while (current != null){
            sb.append(current.data).append(" -> ");
            current = current.prev;
        }
        sb.append("null ]");
        return sb.toString();
    }


    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        System.out.println("STACK="+ st +" SIZE="+ st.size);
        System.out.println("Peeking empty stack = " + st.peek());
        System.out.println("Popping empty stack = " + st.pop());

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("STACK="+ st +" SIZE="+ st.size);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println("STACK="+ st +" SIZE="+ st.size);
        System.out.println("Peeking= " + st.peek());
        st.pop();
        System.out.println("STACK="+ st +" SIZE="+ st.size);
        st.pop();
        System.out.println("STACK="+ st +" SIZE="+ st.size);

    }
}
