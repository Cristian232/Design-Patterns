package com.company.Behavioral.Iterator.FirstImplementation;

//Iterator interface allowing to iterate over the values of the aggregate

public interface Iterator<T> {

    boolean hasNext();

    T next();

}
