package com.company.Structural.Bridge.FirstImplementation;

// This is the implementor

public interface LinkedList<T> {

        void addFirst(T element);

        T removeFirst();

        void addLast(T element);

        T removeLast();

        int getSize();

}
