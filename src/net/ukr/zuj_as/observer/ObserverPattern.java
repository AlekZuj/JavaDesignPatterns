package net.ukr.zuj_as.observer;

import net.ukr.zuj_as.observer.display.CurrentConditionDisplay;
import net.ukr.zuj_as.observer.display.ForecastDisplay;
import net.ukr.zuj_as.observer.display.HeatIndexDisplay;
import net.ukr.zuj_as.observer.display.StatisticDisplay;
import net.ukr.zuj_as.observer.subject.WeatherData;

public class ObserverPattern {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 30.4f);

        System.out.println("--------------------------");
        System.out.println(weatherData.getObservers());

        System.out.println("--------------------------");
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.removeObserver(statisticDisplay);
        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(81, 81, 31.1f);

    }
}
