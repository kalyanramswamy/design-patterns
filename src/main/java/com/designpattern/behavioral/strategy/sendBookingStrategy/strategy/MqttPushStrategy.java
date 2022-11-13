package com.designpattern.behavioral.strategy.sendBookingStrategy.strategy;

import com.designpattern.behavioral.strategy.sendBookingStrategy.context.Booking;

public class MqttPushStrategy implements PushStrategy {

    @Override
    public void SendBooking(Booking booking) {
        System.out.println("Send Booking via mqtt push for imei: " + booking.getImei());
    }
}
