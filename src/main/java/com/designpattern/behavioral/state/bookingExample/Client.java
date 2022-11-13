package com.designpattern.behavioral.state.bookingExample;

import com.designpattern.behavioral.state.bookingExample.context.Booking;
import com.designpattern.behavioral.state.bookingExample.state.BookingCompletedState;
import com.designpattern.behavioral.state.bookingExample.state.BookingInProgressState;

public class Client {
    public static void main(String[] args) {
        Booking booking = new Booking("123456789");
        booking.observer();

        booking.changeState(new BookingInProgressState());
        booking.observer();

        booking.changeState(new BookingCompletedState());
        booking.observer();
    }
}
