package com.designpattern.behavioral.observer.weatherExample.subject;

import com.designpattern.behavioral.observer.weatherExample.Obeserver.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private List<WeatherObserver> observers;
    private WeatherTypes currentWeather;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherTypes.SUNNY;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void unRegister(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer: observers) {
            observer.update(currentWeather);
        }
    }

    public void timePass() {
        WeatherTypes[] enumValues = WeatherTypes.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        notifyObservers();
    }
}
