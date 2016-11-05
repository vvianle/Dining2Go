package com.example.vivianle.diningtogo;

/**
 * Created by candy hu on 2016/11/4.
 */

public class queue<T> {
    LinkedList<T> queue = new LinkedList<T>();


    public void enqueue(T data) {
        queue.insertFirst(data);
    }


    public T dequeue() {
        T last = queue.getLast();
        queue.deleteLast();
        return last;
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek() {
        return queue.getLast();
    }
}
