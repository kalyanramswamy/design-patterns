package com.designpattern.behavioral.iterator.collection;

import com.designpattern.behavioral.iterator.iterator.Iterator;

public interface Collection {
    public Iterator createIterator();
}
