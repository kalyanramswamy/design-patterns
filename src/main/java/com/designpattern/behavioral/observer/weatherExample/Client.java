package com.designpattern.behavioral.observer.weatherExample;

import com.designpattern.behavioral.observer.weatherExample.Obeserver.Hobbits;
import com.designpattern.behavioral.observer.weatherExample.Obeserver.Orcs;
import com.designpattern.behavioral.observer.weatherExample.subject.Weather;

public class Client {
    public static void main(String[] args) {
        Weather weather = new Weather();

        weather.registerObserver(new Hobbits());
        weather.registerObserver(new Orcs());

        weather.timePass();
        weather.timePass();
        weather.timePass();
        weather.timePass();
    }
}
