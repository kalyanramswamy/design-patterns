package com.designpattern.behavioral.state.bookingExample.state;

import com.designpattern.behavioral.state.bookingExample.context.Booking;

public class BookingConfirmState implements BookingState {
    @Override
    public void onEnterState(Booking booking) {
        System.out.println("Imei: " + booking.getImei() + " set in booking confirm state in cache");
    }

    @Override
    public void observe(Booking booking) {
        System.out.println("Imei: " + booking.getImei() + " is in Booking confirm state");
    }
}
