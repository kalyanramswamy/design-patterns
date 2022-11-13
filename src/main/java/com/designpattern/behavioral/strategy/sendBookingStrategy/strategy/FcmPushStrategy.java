package com.designpattern.behavioral.strategy.sendBookingStrategy.strategy;

import com.designpattern.behavioral.strategy.sendBookingStrategy.context.Booking;

public class FcmPushStrategy implements PushStrategy {
    @Override
    public void SendBooking(Booking booking) {
        System.out.println("Send booking via fcm channel for imei: " + booking.getImei());
    }
}
