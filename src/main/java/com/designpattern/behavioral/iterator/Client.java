package com.designpattern.behavioral.iterator;

import com.designpattern.behavioral.iterator.collection.NotificationCollection;
import com.designpattern.behavioral.iterator.iterator.Iterator;
import com.designpattern.behavioral.iterator.iterator.NotificationIterator;
import com.designpattern.behavioral.iterator.product.Notification;

public class Client {
    public static void main(String[] args) {
        // we have a collection
        NotificationCollection collection = new NotificationCollection();
        collection.addItem("Notification 4");

        // traveling through collection with iterator(which will not allow you to change the objects in the collection)
        Iterator iterator = collection.createIterator();

        //travel
        while (iterator.hasNext()) {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
