package lab7.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
     private final int DEFAULT_CAPACITY = 10;
     private int size;
     private Integer[] arr;
     private int front;
     private int rear;
    // Add Constructors, Default and Parameterized to initialize instance fields
    ArrayQueueImpl(){
        arr = new Integer[DEFAULT_CAPACITY];
    }
    public Integer peek() {
        if(size > 0) return arr[rear];
        return null;
    }
    public void enqueue(int obj){
        int reserved = (rear + 1) % arr.length;
        if(size == 0) reserved = 0;

        if(size == arr.length){
            resize();
            enqueue(obj);
        }else{
            arr[reserved] = obj;
            rear = reserved;
            size++;
        }

    }
    public Integer dequeue() {
        if(size == 0){
            System.out.println("Queue empty error:");
            return null;
        }
        Integer res = arr[front++];
        size--;
        if(size == 0) front = 0;
        return res;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    private void resize(){
        Integer[] _new = new Integer[arr.length * 2];
        for(int i = 0; i < size; i++){
            int cur = (i + front) % arr.length;
            _new[i] = arr[cur];
        }
        arr = _new;
        front = 0;
        rear = size - 1;
    }
     public String toString(){
     /* Return data in this format, each element separated by comma with in [ ] eg:
    [10, 20, 30, 40, 50, 60 ]*/
         StringBuilder sb = new StringBuilder();
         sb.append("[");
         for(int i = 0; i < size; i++){
             int cur = (i + front) % size;
             sb.append(arr[cur]);
             if(i + 1 < size) sb.append(", ");
         }
         sb.append("]");
         return sb.toString();
     }
}