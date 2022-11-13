package com.designpattern.behavioral.strategy.sendBookingStrategy.strategy;

import com.designpattern.behavioral.strategy.sendBookingStrategy.context.Booking;

public interface PushStrategy {
    public void SendBooking(Booking booking);
}
