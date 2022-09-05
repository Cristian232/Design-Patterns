package com.company.Structural.Bridge.FirstImplementation;

// refined abstraction

public class Queue<T> implements FifoCollection{

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(Object element) {
        list.addLast((T) element);
    }

    @Override
    public Object poll() {
        return list.removeFirst();
    }
}
