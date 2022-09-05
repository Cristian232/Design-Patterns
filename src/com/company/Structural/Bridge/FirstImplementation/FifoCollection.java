package com.company.Structural.Bridge.FirstImplementation;


// Our first abstraction

public interface FifoCollection<T> {

    void offer(T element);

    T poll();


}
