package com.designpattern.behavioral.strategy.sendBookingStrategy;

import com.designpattern.behavioral.state.bookingExample.state.BookingState;
import com.designpattern.behavioral.strategy.sendBookingStrategy.context.Booking;
import com.designpattern.behavioral.strategy.sendBookingStrategy.strategy.FcmPushStrategy;

public class Client {
    public static void main(String[] args) {
        Booking booking = new Booking("123456789", "confirm");
        booking.setStrategy(new FcmPushStrategy());
        booking.sendBooking();
    }
}
