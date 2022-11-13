package com.designpattern.behavioral.strategy.sendBookingStrategy.context;

import com.designpattern.behavioral.state.bookingExample.state.BookingState;
import com.designpattern.behavioral.strategy.sendBookingStrategy.strategy.PushStrategy;

public class Booking {
    private String imei;
    private String bookingState;
    private PushStrategy strategy;

    public Booking(String imei, String state) {
        this.imei = imei;
        this.bookingState = state;
    }

    public void setStrategy(PushStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendBooking() {
        this.strategy.SendBooking(this);
    }

    public String getImei() {
        return this.imei;
    }
}
