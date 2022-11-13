package com.designpattern.behavioral.state.bookingExample.state;

import com.designpattern.behavioral.state.bookingExample.context.Booking;

public interface BookingState {
    void onEnterState(Booking booking);

    void observe(Booking booking);
}
