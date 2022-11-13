package com.designpattern.behavioral.observer.weatherExample.subject;

public enum  WeatherTypes {
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
