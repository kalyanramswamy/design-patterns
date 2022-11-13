package com.designpattern.behavioral.state.bookingExample.context;

import com.designpattern.behavioral.state.bookingExample.state.BookingConfirmState;
import com.designpattern.behavioral.state.bookingExample.state.BookingState;

public class Booking {
    private BookingState currentState;
    private String imei;

    public Booking(String imei) {
        this.imei = imei;
        currentState = new BookingConfirmState();
    }

    public void changeState(BookingState state) {
        this.currentState = state;
        this.currentState.onEnterState(this);
    }

    public void observer() {
        this.currentState.observe(this);
    }

    public String getImei() {
        return this.imei;
    }
}
