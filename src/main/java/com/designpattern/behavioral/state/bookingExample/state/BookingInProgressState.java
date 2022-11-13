package com.designpattern.behavioral.state.bookingExample.state;

import com.designpattern.behavioral.state.bookingExample.context.Booking;

public class BookingInProgressState implements BookingState {
    @Override
    public void onEnterState(Booking booking) {
        System.out.println("Imei: " + booking.getImei() + " set in booking in_progress state in cache");
    }

    @Override
    public void observe(Booking booking) {
        System.out.println("Imei: " + booking.getImei() + " is in Booking in_progress state");
    }
}
