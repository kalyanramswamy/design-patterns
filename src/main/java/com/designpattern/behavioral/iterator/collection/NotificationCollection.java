package com.designpattern.behavioral.iterator.collection;

import com.designpattern.behavioral.iterator.iterator.Iterator;
import com.designpattern.behavioral.iterator.iterator.NotificationIterator;
import com.designpattern.behavioral.iterator.product.Notification;

public class NotificationCollection implements Collection {
    Notification[] notificationList;
    int currentSize = 0;

    public NotificationCollection() {
        notificationList = new Notification[1000];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        notificationList[currentSize++] = new Notification(str);
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
