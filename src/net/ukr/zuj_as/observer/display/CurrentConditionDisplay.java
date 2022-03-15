package net.ukr.zuj_as.observer.display;

import net.ukr.zuj_as.observer.observer.Observer;
import net.ukr.zuj_as.observer.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
