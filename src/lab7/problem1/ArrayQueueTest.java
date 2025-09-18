package lab7.problem1;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        q.dequeue();

        for(int i = 0; i < 10; i++){
            q.enqueue(i);
        }

        System.out.println(q.toString());

        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println(q.toString());

        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println("size: " + q.size());

        q.enqueue(13);
        System.out.println("size: " + q.size());
    }
}
