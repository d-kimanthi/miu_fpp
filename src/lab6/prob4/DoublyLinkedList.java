package lab6.prob4;


public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node(null);
    }
    //1. adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node(item);

        Node cur = header;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.previous = cur;
        newNode.next = null;
    }


    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        Boolean res = false;
        Node cur = header.next;
        // traverse the list
        while (cur != null){
            if((cur.value == null && item == null) || (cur.value != null && cur.value.equals(item))){
                // Unlink cur
                Node before = cur.previous;
                Node after  = cur.next;

                before.next = after;
                if (after != null) {
                    after.previous = before;
                }
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    // 3. Remove the First Node
    public boolean removeFirst() {
        Node first = header.next;
        if (first == null) {
            return false;
        }
        Node second = first.next;

        header.next = second;
        if (second != null) {
            second.previous = header;
        }

        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        // Implement
        Node tail = header.next;
        if (tail == null) {
            System.out.println("[]");
            return;
        }
        while (tail.next != null) {
            tail = tail.next;
        }

        StringBuilder sb = new StringBuilder();
        for (Node cur = tail; cur != header; cur = cur.previous) {
            sb.append(cur.value).append(" -> ");
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public Node(String data){
            this.value = data;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods
        list.addLast("John");
        list.addLast("Dave");
        System.out.println("After adding two items: " + list);
        list.removeFirst();
        System.out.println("After removing first item: " + list);
        boolean bool = list.remove("John");
        boolean bool2 = list.remove("Sammy");
        System.out.println(bool +" "+ bool2);
        System.out.println(list);
        list.printReverse();
    }
}
