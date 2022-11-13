package com.designpattern.behavioral.iterator.iterator;

import com.designpattern.behavioral.iterator.product.Notification;

public class NotificationIterator implements Iterator {
    private Notification[] notificationList;

    int currentPosition = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @ Override
    public boolean hasNext() {
        if(currentPosition >= notificationList.length || notificationList[currentPosition] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = notificationList[currentPosition];
        currentPosition++;
        return notification;
    }
}
