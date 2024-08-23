package com.codewithmosh.iterator;

public interface Iterator<T> {
    public T getNext();
    boolean hasNext();
    void next();
}
