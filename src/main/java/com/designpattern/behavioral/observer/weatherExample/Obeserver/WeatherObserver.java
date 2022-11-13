package com.designpattern.behavioral.observer.weatherExample.Obeserver;

import com.designpattern.behavioral.observer.weatherExample.subject.WeatherTypes;

public interface WeatherObserver {
    public void update(WeatherTypes weatherTypes);
}
