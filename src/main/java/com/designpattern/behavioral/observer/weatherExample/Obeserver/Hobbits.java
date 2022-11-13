package com.designpattern.behavioral.observer.weatherExample.Obeserver;

import com.designpattern.behavioral.observer.weatherExample.subject.WeatherTypes;

public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherTypes weatherTypes) {
        System.out.println("Hobbits are experiencing " + weatherTypes + " weather");
    }
}
