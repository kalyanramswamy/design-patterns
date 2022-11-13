package com.designpattern.behavioral.observer.weatherExample.Obeserver;

import com.designpattern.behavioral.observer.weatherExample.subject.WeatherTypes;

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherTypes weatherTypes) {
        System.out.println("Orc's are experiencing " + weatherTypes + " weather");
    }
}
